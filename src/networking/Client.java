// Client.java

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Client extends JFrame {
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	String message = "";
	private String chatServer;
	private Socket client;
	private Socket connection;
	private int counter = 1;

	public Client ( String host ) {
		super ("Client");

		chatServer = host;
		enterField = new JTextField( "type to chat .. " );

		enterField.setEditable( false );
		enterField.addActionListener ( new ActionListener( ) {
			public void actionPerformed ( ActionEvent event ) {
				sendData( event.getActionCommand ( ) );
				enterField.setText( "" );
			}
		} );

		add ( enterField, BorderLayout.SOUTH );

		displayArea = new JTextArea ( );
		add( new JScrollPane( displayArea ), BorderLayout.CENTER );
		setSize ( 1024,768 );
		setVisible ( true );
	}

	// set up and run Server 
	public void runClient ( ) {

		try {
			connectToServer ( );
			getStreams ( );
			processConnection ( );
		}

		catch ( EOFException eofException ) {
			displayMessage( "\nClient terminated connection");
		}

		catch ( IOException ioException ) {
			ioException.printStackTrace( );
		}

		finally {
			closeConnection ( );
		}

	}

	private void connectToServer ( ) throws IOException {
		displayMessage ( "Attempting Connection .. " );
		client = new Socket ( InetAddress.getByName( chatServer ), 12345 );
		displayMessage ( "Connected to: " + client.getInetAddress( ).getHostName( ) );
	}

	private void getStreams ( ) throws IOException {
		output = new ObjectOutputStream ( client.getOutputStream( ) );
		output.flush( );

		input = new ObjectInputStream ( client.getInputStream( ) );
		displayMessage( "\nGot I/O streams\n");
	}

	private void processConnection ( ) throws IOException {
		
		setTextFieldEditable ( true );
		do {
			try {
				message = ( String ) input.readObject ( );
				displayMessage( "\n" + message );
			}

			catch ( ClassNotFoundException classNotFoundException ) {
				displayMessage( "\nUnknown object type recieved" );
			}
		} while ( !message.equals ( "SERVER>>> TERMINATE" ) );
	}

	private void closeConnection ( ) {
		displayMessage ( "\nClosing connection");
		setTextFieldEditable( false );

		try {
			output.close( );
			input.close( );
			client.close( );
		}

		catch ( IOException ioException ) {
			ioException.printStackTrace ( );
		}
	}

	private void sendData ( String message ) {
		try {
			output.writeObject ( "Client>>> " + message );
			output.flush( );
			displayMessage( "\nClient>>> " + message );
		}

		catch ( IOException ioException ) {
			displayArea.append( "Error writing object" );
		}
	}

	private void displayMessage ( final String messageToDisplay ) {
		SwingUtilities.invokeLater ( 
			new Runnable( ) {
				public void run ( ) {
					displayArea.append( messageToDisplay );
				}
			}
		);
	}

	private void setTextFieldEditable ( final boolean editable ) {
		SwingUtilities.invokeLater ( 
			new Runnable ( ) {
				public void run ( ) {
					enterField.setEditable( editable );
				}
			}
		);
	}

	public static void main(String[] args) {
		Client application;

		if(args.length == 0 )
			application = new Client( "127.0.0.1 ");
		else
			application = new Client( args[0] );

		application.setDefaultLookAndFeelDecorated ( true );
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.runClient( );	
	}


}
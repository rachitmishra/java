// You Messenger / Client GUI

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
/*
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.TextArea;
import javax.swing.SwingUtilities;
*/
import javax.swing.border.BevelBorder; 


public class You extends JFrame {
	private JMenu serverMenu;
	private JTextArea messageArea;
	private JTextArea inputArea;
	private JButton connectButton;
	private JMenuItem connectMenuItem;
	private JButton disconnectButton;
	private JMenuItem disconnectMenuItem;
	private JButton sendButton;
	private JLabel statusBar;
	private String userName;
	private MessageManager messageManager;
	private MessageListener messageListener;

		public You ( MessageManager manager ) {
			super( "You Messenger");
			messageManager = manager;
			messageListener = new MyMessageListener ( );
			severMenu = new Jmenu ( "Server" );
			serverMenu.setMnemonic( 'S' );
			JMenuBar.add( serverMenu );
			setJMenuBar( menuBar );

			// create ImageIcon for connect buttons 
			Icon connectIcon = new ImageIcon( getClass( ).getResource( "images/connect.png" ) );
			
			// create connectButton and connectMenuItem
			connectButton = new JButton( "Connect", connectIcon );
			connectMenuItem = new JMenuItem( "Connect", connectIcon );
			connectMenuItem.setMnemonic( 'C' );

			// create ConnectListener for connect buttons
			ActionListener connectListener = new ConnectListener ( );
			connectButton.addActionListener( connectListener );
			connectMenuItem.addActionListener( connectListener );

			//
			// create ImageIcon for disconnect buttons 
			Icon disconnectIcon = new ImageIcon( getClass( ).getResource( "images/disconnect.png" ) );
			
			// create disconnectButton and disconnectMenuItem
			disconnectButton = new JButton( "Disconnect", disconnectIcon );
			disconnectMenuItem = new JMenuItem( "Disconnect", disconnectIcon );
			disconnectMenuItem.setMnemonic( 'D' );

			// create DisconnectListener for connect buttons
			ActionListener disconnectListener = new DisconnectListener ( );
			disconnectButton.addActionListener( disconnectListener );
			disconnectMenuItem.addActionListener( disconnectListener );
			
			// disable disconnect button snd menu item
			disconnectButton.setEnabled( false );
			disconnectMenuItem.setEnabled( false );

			// add connect and disconnect JMenuIems to fileMenu
			serverMenu.add( connectMenuItem );
			serverMenu.add( disconnectMenuItem );

			// add connect and disconnect JButtons to buttonPanel
			JPanel buttonPanel = new JPanel ( );
			buttonPanel.add ( connectButton );
			buttonPanel.add( disconnectButton );

			messageArea = new JTextArea( );
			messageArea.setEditable( false );
			messageArea.setWrapStyleWord( true );
			messageArea.setLineWrap( true );

			JPanel messagePanel = new JPanel ( );
			messagePanel.setLayout( new BorderLayout ( 10, 10 ) );
			messagePanel. add ( new JScrollPane ( messageArea ), BorderLayout.CENTER );

			inputArea = new JTextArea ( 4, 20 );
			messageArea.setEditable( false );
			messageArea.setWrapStyleWord( true );
			messageArea.setLineWrap( true );
			
			inputArea.addActionListener ( new ActionListener( ) {
				public void actionPerformed ( ActionEvent event ) {
					messageManager.sendMessage( userName, inputArea.getText( ) );
					inputArea.setText( "Type here to chat ");
				}
			} );

			Box box = new Box( BoxLayout.X_AXIS );
			box.add( new JScrollPane ( inputArea ) );
			box.add ( sendButton );
			messagePanel.add( box, BorderLayout.SOUTH );

			statusBar = new JLabel ( "Not Connected" );
			statusBar.setBorder ( new BevelBorder ( BevelBorder.LOWERED ) );

			add ( buttonPanel, BorderLayout.NORTH );
			add ( messagePanel, BorderLayout.CENTER );	
			add ( statusBar, BorderLayout.SOUTH );

			addWindowListener ( 
				new WindowAdapter ( ) {
					public void windowClosing ( WindowEvent event ) {
						messageManager.disconnect( messageListener );
						System.exit ( 0 );
					}
			});
		}

		private class ConnectListener implements ActionListener {
			public void actionPerformed ( ActionEvent event ) {
				messageManager.connect( messageListener );

				userName = JOptionPane.showInputDialog ( You.this, "Enter your name : ");
				messageArea.setText("");
				connectButton.setEnabled( false );
				connectMenuItem.setEnabled( false );
				disconnectButton.setEnabled( true );
				disconnectMenuItem.setEnabled( true );
				sendButton.setEnabled( true );
				inputArea.setEnabled ( true );
				inputArea.requestFocus( );
				statusBar.setText ( "Connected: " + userName );
			}
		}

		private class DisconnectListener implements ActionListener {
			public void actionPerformed ( ActionEvent event ) {
				messageManager.connect( messageListener );

				messageManager.disconnect ( messageListener );
				connectButton.setEnabled( true );
				connectMenuItem.setEnabled( true );
				disconnectButton.setEnabled( false );
				disconnectMenuItem.setEnabled( false );
				sendButton.setEnabled( false );
				inputArea.setEnabled ( false );
				statusBar.setText ( "Not Connected " );
			}
		}

		private class MyMessageListener implements MessageListener {
			public void messageRecieved ( String from, String message ) {
				SwingUtilities.invokeLater ( new MessageDisplayer ( from, message ));
			}
		}

		private class MessageDisplayer implements Runnable {
			private String fromUser;
			private String messageBody;

			public MessageDisplayer ( String from, String body ) {
				fromUser = from;
				messageBody = body;
			}

			public void run ( ) {
				messageArea.append ( "\n" + fromUser + ">" + messageBody );
			}
		}
}
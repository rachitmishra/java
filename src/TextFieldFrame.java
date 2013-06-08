import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TextFieldFrame extends JFrame {

	private JTextField textField;
	private JPasswordField passwordField;

	public TextFieldFrame ( ) {
		super(" Testing JTextField & JPasswordField ");
		setLayout ( new FlowLayout ( ) );

		textField = new JTextField("Enter Name ", 10 );
		textField.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
		add( textField );

		passwordField = new JPasswordField("Enter Password ", 10 );
		passwordField.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
		add( passwordField );

		TextFieldHandler handler = new TextFieldHandler( );
		textField.addActionListener( handler );
		passwordField.addActionListener( handler );
	}

	private class TextFieldHandler implements ActionListener {
		public void actionPerformed ( ActionEvent event ) {
			String string ="";
			if( event.getSource( ) == textField )
				string = String.format( "textField: %s", event.getActionCommand( ) );
			else if( event.getSource( ) == passwordField )
				string = String.format( "passwordField: %s", event.getActionCommand( ) );

			JOptionPane.showMessageDialog( null, string, "Message", JOptionPane.PLAIN_MESSAGE );
		}


	}

	public static void main(String[] args) {
		TextFieldFrame textFieldFrame = new TextFieldFrame( );
		textFieldFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		textFieldFrame.setSize( 400, 400 );
		textFieldFrame.setVisible( true );
	}
}
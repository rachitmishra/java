// WelcomeApplet.java

import java.awt.Graphics;
import javax.swing.JApplet;

public class WelcomeApplet extends JApplet {
	public void paint ( Graphics g ) {
		super.paint ( g );
		g.drawRect( 40, 80, 80, 40 );
		g.fillRect("red");
		g.drawString ( "Welcome to JAVA Programming !", 25, 25 );
	}
}
import javax.swing.JOptionPane;
import javax.swing.JApplet;
import java.awt.Graphics;

public class CalculationApplet extends JApplet {
	private static String firstNumber;
	private static String secondNumber;
	private double number1;
	private double number2;

	public void init ( ) {
		firstNumber = JOptionPane.showInputDialog( "Enter Number 1( Numerator ) : " );
		secondNumber = JOptionPane.showInputDialog( "Enter Number 2 ( Denominator ) : " );
		number1 = Double.parseDouble( firstNumber );
		number2 = Double.parseDouble( secondNumber );
		double sum = number1 + number2 ;
		double multi =   number1*number2 ;
		double subtract =  number1>number2 ? number1-number2:number2-number1;
		double divide = number1==0 ? 0 : number2/number1;
	}

	public void paint ( Graphics g ) {
		super.paint( g );
		g.drawRect ( 20, 20, 350, 150 );
		g.drawString (" Summation is : " + ( number1 + number2 ), 60, 60 );
		g.drawString (" Multiplication is : " + ( number1*number2 ), 60, 76 );
		g.drawString (" Substraction is : " + (number1>number2 ? number1-number2:number2-number1), 60, 92 );
		g.drawString (" Division is : " + (number1==0 ? " Numerator can't be zero " : number2/number1), 60, 108  );
	}
}
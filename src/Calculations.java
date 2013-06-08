import javax.swing.JOptionPane;

public class Calculations {
	
	private static String firstNumber;
	private static String secondNumber;
	private double firstNumber;
	private double secondNumber;

	static {
		firstNumber = JOptionPane.showInputDialog( "Enter Number 1 : ");
		secondNumber =  JOptionPane.showInputDialog( "Enter Number 2  ( Denominator ) : ");
		
	}

	public void calculator ( ) {
		number1 = Double.parseDouble( firstNumber );
		number2 = Double.parseDouble( secondNumber );
		System.out.println (" Summation is : " + ( number1 + number2 ) );
		System.out.println (" Multiplication is : " + ( number1*number2 ) );
		System.out.println (" Substraction is : " + (number1>number2 ? number1-number2:number2-number1) );
		System.out.println (" Division is : " + (number1==0 ? " Numerator can't be zero " : number2/number1) );

		/*
		number1 = Double.parseDouble( firstNumber );
		number2 = Double.parseDouble( secondNumber );
		double sum = number1 + number2 ;
		double multi =   number1*number2 ;
		double subtract =  number1>number2 ? number1-number2:number2-number1;
		double divide = number1==0 ? 0 : number2/number1;
		*/
		
	}

	public static void main(String[] args) {
		Calculations calc = new Calculations ( );
		calc.calculator ( ) ;

	}
}
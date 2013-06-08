/* Exception Handling in Java using try and catch */

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Exceptions {
		public static int divider ( int numerator, int denominator ) throws ArithmeticException{
			return numerator/denominator;
		}
		public static void main(String[] args) {
			Exceptions obj = new Exceptions( );
			Scanner scanner = new Scanner( System.in );
			
			boolean loops = true ;
			do {
				try {
					System.out.print(" Enter the Numerator : ");
					int numerator = scanner.nextInt( );
					System.out.print(" Enter the Denominator : ");
					int denomiator = scanner.nextInt( );
			
			
					int result = divider( numerator, denomiator );
					System.out.printf(" \n Result : %d  \n ", result );
					loops = false;
				}

				catch ( InputMismatchException e ) {
					System.err.println ( " Exception : "+ e );	
					scanner.nextLine( );
					System.out.println ( " Please enter Integers. Try Again. ");
				}

				catch ( ArithmeticException e ) {
					System.err.println ( " Exception : "+ e );
					System.out.println ( " Don't divide by zero. ");
				}
			} while ( loops );
	}
}
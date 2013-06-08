/* Exception Handling in Java using try and multi - catch */

import java.util.InputMismatchException;
import java.util.Scanner;

	public class MultiCatch {
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

				catch ( InputMismatchException |  ArithmeticException e ) {
					System.err.println ( " Exception : "+ e );	
					scanner.nextLine( );
					System.out.println ( " -- Error -- ");
				}
			} while ( loops );
	}
}
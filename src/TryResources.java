/* Exception Handling in Java using try ( with Automatic Resource Deallocation ) and catch */

import java.util.InputMismatchException;
import java.util.Scanner;

	public class TryResources {
		public static int divider ( int numerator, int denominator ) throws ArithmeticException{
			return numerator/denominator;
		}
		public static void main(String[] args) {
			//Scanner scanner = new Scanner( System.in );
			
			boolean loops = true ;
			do {
				try( Scanner scanner = new Scanner( System.in ) ) {
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
					System.out.println ( " -- Error -- ");
				}
			} while ( loops );
	}
}
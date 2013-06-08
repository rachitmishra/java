import java.util.Scanner;

public class Assertions {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print( " Enter a number between 0 - 10 : ");
		int number = input .nextInt( );

		try { 
			assert ( number >= 0 && number <= 10 ) : "bad number" + number;
		}

		catch ( AssertionError e ) {
			System.out.println( " Oops .. ! Error .. ");
		}
		System.out.println( " You Entered the number " + number );
	}
}
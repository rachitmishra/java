
public class Datatypes {


	public static void main ( String[ ] args) {
		/*
		Data types are mainly divided into two categories : 
		- Primitive Data types
		- Non-primitive Data types.

		Primitive Data types are of Four types : 

		- Integral Data types.
		- Floating Point Data types.
		- Textual Data types.
		- Logical Data types.

		Non Primitive Data types consist of Reference Variables
		*/

		// Integral Data types ( are used for integral literals/numbers.)
		byte a = 127; // 8 bits ( Range from -128 to 127 )
		short b = 14; // 16 bits
		int c = 1; // 32 bits
		long d = 123L; // 64 bits append L/l for declaring a long variable.

		// Floating Point Data types ( are used for decimal literals/numbers )
		float e = 12.5f; // append F/f for declaring a double variable.
		double f = 123e+12D; // append D for declaring a double variable.

		// Textual Data types ( are used for characters or textual representations )
		char g = 'R'; // 16 bit UNICODE character.
		String h = "Dancing in the Rain "; // Used to store group of characters/Strings.

		// Logical Data types
		boolean i = false;  // It can only hold two values i.e. either True or False. If not initialised it is always false.

		// Reference Variables ( variables that store reference to objects. )

		Datatypes j = new Datatypes();
		

		

		// Printing all the Variables .. 
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		System.out.println( d );
		System.out.println( e );
		System.out.println( f );
		System.out.println( g );
		System.out.println( h );
		System.out.println( i );
		System.out.println( j );


	}
}
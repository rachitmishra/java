 
 // Static Initialisation Blocks & Instance Initialisation Blocks.

/*
Static Initialisation Block  use the static keyword before block statements ( i.e static { } )....
SIBs are executed once the class is loaded in order they are written in source code.
*/


class InitialisationBlock {

	private static int ClassVar = initialiserClassVariable ( );


 // Static variable Initialisation can be performed through static methods.
	private static int initialiserClassVariable ( ) {
  	return ClassVar = 10;
    }
 	public static void main(String[] args) { // this executes last.
 		System.out.println (" Hi .. I am from main(). ");
 		System.out.println(" "+InitialisationBlock.ClassVar );

 	}

 	static { // will be executed first.
 		ClassVar = 100; // Initialising a class variable using SIB.
 		System.out.println("\n "+ClassVar );
 		System.out.println (" First Static Initialisation Block ");
 		InitialisationBlock ib = new InitialisationBlock ( );
 	}


 	static { // will be executed second.
 		System.out.println (" Second Static Initialisation Block ");
 	}

 	/*

 	*/

 	{
 		System.out.println (" This is an IIB ");
 	}

  
}
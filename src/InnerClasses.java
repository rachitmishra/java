public class InnerClasses{
	static String string ;
	static class Inner {
	  	void testSet( ) {
	  	  	string = "Set from Inner Class" ;
	  	}
	}

	public static void main( String[ ] args ) {
	InnerClasses innerClasses = new InnerClasses ( ) ;
	System.out.println(InnerClasses.string);
	}
}
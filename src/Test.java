// Test.java
// A test class to test simple errors or confusions during study.
class Test {
	public static void main(String[] args) {
		// testing formatted output ( i.e using ',' before conversion specifier )

		System.out.printf( "%s $%,.2f", "Hi",1000002.347); // output- Hi 1,000,002.35

		// testing Reflection properties of java on object of class Test to get its class name. ( using getClass( ).getName( ))

		Test test = new Test( );
		System.out.println("\n"+test.getClass( ).getFile( ) ); //output- Test
	}
}
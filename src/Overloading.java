// Overloading.java 
// Shows constructor and function overloading.

class Tree {
	// class variable height can be accesed with this keyword.
	int height;

	// No-arg default constructor.
	public Tree ( ) {
		System.out.println("Planting a Seedling ...");
		height = 0;
	}

	// Overloaded constructor with different parameter.
	public Tree( int height ) {
		this.height = height;
		System.out.println( "Creating a new tree "+height+" meter tall.");
	}

	// First info function
	public void info ( ) {
		System.out.println( "Tree is "+height+" meter tall.");
	}

	// Overloaded function with different parameters.
	public void info ( String b ) {
		System.out.println( b+"The tree is now "+height+" meter tall.");
	}
}
public class Overloading {
	public static void main(String[] args) {
		System.out.println("***********************************************");
		for (int i = 0;i<5 ;i++ ) {
			Tree tree = new Tree( i );
			tree.info( );
			tree.info( "Overloaded Method .. " );	
		}
		new Tree( );
		System.out.println("***********************************************");
	}
}

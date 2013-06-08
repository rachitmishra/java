public class ObjectAsParameter extends InheritA {
	InheritA obj;
	void print( InheritA obj ){
		this.obj = obj;
		obj.print( );
		System.out.println("Base Class.");
	}

	public static void main(String[] args) {
		InheritA obj1 = new InheritA( );
		ObjectAsParameter obj2 = new ObjectAsParameter( );
		obj2.print( obj1 );
	}
}
import java.lang.Thread;

class Threading extends Thread {
	public static void main(String[] args) {
		Threading obj = new Threading ( );
		obj.start();
		//obj.foo();
		System.out.println(" Calling from main() ");

	}

	public void foo( ) {
		System.out.print(" Calling from foo ");
	}
}
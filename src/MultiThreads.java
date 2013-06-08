// MultiThreads.java
// A program to test Multi Threading

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class MultiThreads implements Runnable {

	public MultiThreads ( ) { }

	@Override
	public void run ( ) {
		System.out.println("\n Waiting");
	}

	public static void main(String[] args) {

		 /*MultiThreads multiThreads = new MultiThreads( );
		MultiThreads2 multiThreads2 = new MultiThreads2( );

		ExecutorService threadExecutor = Executors.newCachedThreadPool( );

		threadExecutor.execute( multiThreads );

		threadExecutor.execute( multiThreads2 );*/

		Thread thread = new Thread ( new MultiThreads( ), "MultiThreads" );
		thread.start( );

		System.out.println("\nname: "+thread.getName( ) );



	}
}

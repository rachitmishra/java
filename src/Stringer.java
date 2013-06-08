import java.util.*;

public class Stringer {

	String sentence;
	 int numberOfWords = 1;
	 int index = 0;	

	public void stringInput ( )		 {
		
		String sentence;
		
		System.out.print("  Enter the String : ");
		Scanner input = new Scanner( System.in );
		sentence = input.nextLine( );

		System.out.println ("  You have entered : "+sentence);

		//Counting number of words
		for (int i = 0; i<sentence.length( );i++)	{
			if(sentence.charAt(i) ==' ')
				numberOfWords++;

		}

		// Printing out number of words
		System.out.println (" \n  Number of words are : "+numberOfWords);
		fractorString ( sentence );
	}

	//Splitting the String
	public void fractorString  ( String sentence ) {

		char[ ][ ] words = new char[numberOfWords+2][20];
		int rows = 0;
		int j,k=0;
		
			for (j=0; j<20&&k<sentence.length( );k++) {
				words[ rows ][ j ]=sentence.charAt( k);

				if( sentence.charAt(k)==' ') {
					rows++;
					j=0;
				 }
				 else
					 j++;
		  	}
		 System.out.println("\n  Splitted String ( Words ) : ");
		 printer ( words );
		 sortString (words, index );


		System.out.println("\n  Sorted  String : ");
		 printer ( words );

	}



	public void sortString  ( char[ ][ ] words, int i ) 	{

		for(int m=1; m<numberOfWords; m++ ) 	  {
			for(int n=0; n<numberOfWords-1; n++)	 {
				 if( words[n][i]>words[n+1][i])
				swapper(words, n, n+1 );
				 if ( words[n][i]==words[n+1][i]&&i<25)	
				   sortString  ( words, i+1 ) ;

						              
			}
		}
	

	}

	

	public void swapper( char[ ][ ] words, int small, int large)	{

		for(int z=0; z<20; z++)	{
			char[ ] temp = new char[20];
			temp[z]= words[small][z];
			words[small][z]=words[large][z];
			words[large][z]=temp[z];
		}

	}

		
	public void printer ( char[ ][ ] words )  {
		
		for(int x = 0; x<numberOfWords; x++ ) 	{
			System.out.print("  ");
			for(int y = 0; y<20; y++ )	 {
				System.out.print(words[x][y]);
			 }
			 System.out.println( );
		
		}
		
	} 


	public static void main(String[] args)	{
	 	Stringer strings = new Stringer( );

	 	System.out.println( "--------------------START\n");
	 	strings.stringInput( );

	 	System.out.println( "\n--------------------END ");
}

}


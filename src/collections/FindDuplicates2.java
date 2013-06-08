//   importing java.util package for using Collections API
import java.util.*;
//    declare FindDuplicates class for finding duplicates in the Collection
class FindDuplicates2 {
	//   main method receiving command line arguments
	public static void main(String[] args) {
		//    Declare HashSet Collection
		Set <String> uniques = new HashSet <> ( );
		Set <String> dups = new HashSet <> ( );
		//    Iterate over collection using for loop
		for ( String a : args ) 
			if ( !uniques.add(a) )
				dups.add(a);
			//    Print the distinct words
		uniques.removeAll(dups);

	        	System.out.println("Unique words:    " + uniques);
        		System.out.println("Duplicate words: " + dups);
    	}
// end class
}
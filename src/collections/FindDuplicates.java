//   importing java.util package for using Collections API
import java.util.*;
//    declare FindDuplicates class for finding duplicates in the Collection
class FindDuplicates {
	//   main method receiving command line arguments
	public static void main(String[] args) {
		//    Declare HashSet Collection
		Set <String> s = new HashSet <String> ( );
		//    Iterate over collection using for loop
		for ( String a : args ) 
			//   Add new element to collection if it does'nt exists
			if ( !s.add(a) )
				System.out.println("Duplicate String : " + a);
			//    Print the distinct words
			System.out.println(s.size( ) + " Distinct words : " + s);
	//    end main
	}
// end class
}
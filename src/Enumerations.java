
public class Enumerations {

	Day day; 

	public Enumerations ( Day day ) {
		this.day = day;
	}

	public Enumerations ( ) { }

	public void FunnyPrinter ( ) {
		switch( day )
		{
			case MONDAY: System.out.println(" MONDAY means More Work. "); break;
			case FRIDAY: System.out.println(" FRIDAY means new Movies. "); break;
			case SATURDAY: case SUNDAY: System.out.println(" WEEKENDS are Best. "); break;
			default: System.out.println(" WEEKDAYS are Boring. ");
		}
	}

	public void Enumerator ( ) {
		for ( Day day : Day.values( ))
			System.out.println( day );
	}
	public static void main(String[] args) {

			Enumerations dayOne = new Enumerations( Day.MONDAY );
			dayOne.FunnyPrinter( );
			Enumerations dayThree = new Enumerations( Day.WEDNESDAY );
			dayThree.FunnyPrinter( );
			Enumerations dayFive = new Enumerations( Day.FRIDAY );
			dayFive.FunnyPrinter( );
			Enumerations daySeven = new Enumerations( Day.SUNDAY );
			daySeven.FunnyPrinter( );
			Enumerations enume = new Enumerations();
			enume.Enumerator( );

	
	}
}
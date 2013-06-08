//SalariedEmployee2.java
//SalariedEmployee2 concrete class extends abstract class Employee which implements Payable interface.

public class SalariedEmployee2 extends Employee2
{
	private double weeklySalary;

	public SalariedEmployee2 ( String first, String last, String ssn, double salary ) {
		super( first, last, ssn );
		setWeeklySalary( salary );
	}

	public void setWeeklySalary ( double salary ) {
		if ( salary >= 0.0 ) 
			weeklySalary = salary;
		else 
			throw new IllegalArgumentException( " Weekly salary must be >= 0.0 ");
	}

	public double getWeeklySalary( ) {
		return weeklySalary;
	}

	@Override 
	public double getPaymentAmount ( ) {
		return getWeeklySalary( );
	}

	@Override
	public String toString( ) {
		return String.format( "salaried employee : %s\n%s : $%,.2f", super.toString( ),
			"weeklySalary", getWeeklySalary( ) );
	}
}
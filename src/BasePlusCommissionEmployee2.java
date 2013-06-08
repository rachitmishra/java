//BasePlusCommissionEmployee2.java
//BasePlusCommissionEmployee2 class extends abstract class Employee which implements Payable interface.

public class BasePlusCommissionEmployee2 extends CommissionEmployee2 {
	private double baseSalary;

	public BasePlusCommissionEmployee2 ( String first, String last, String ssn, double sales, double rate, double salary ) {
		super( first, last, ssn, sales, rate );
		setBaseSalary( salary );
	}

	public void setBaseSalary ( double salary ) {
		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException ("Base Salary must be >= 0.0 ");
	}

	public double getBaseSalary ( ) {
		return baseSalary;
	}

	@Override
	public double getPaymentAmount( ) {
		//return baseSalary + ( commissionRate * grossSales );
		return getBaseSalary( ) + super.getPaymentAmount( );
	}
	@Override
	public String toString ( ) {
		return String.format ("%s : %s; %s :  $%,.2f", " base-salaried",
			super.toString( ),
			"base salary ", getBaseSalary ( ) );
	}
}

// PayableInterfaceTest.java
// tests Interface Payable.

public class PayableInterfaceTest {
	public static void main(String[] args) {
		
		Payable[ ] payableObjects = new Payable [ 4 ];
		payableObjects [ 0 ] = new Invoice ( "01234", "seat", 2, 375.45 );
		payableObjects [ 1 ] = new Invoice ( "56789", "tire", 4, 79.45 );
		payableObjects [ 2 ] = new SalariedEmployee2 ( "John", "Karter", "111-111-1111", 800.00 );
		payableObjects [ 3 ] = new BasePlusCommissionEmployee2 ( "Kate", "Roselin", "444-444-4444", 5000, .04, 300 );

		System.out.println ("Invoices and Employees processed polymorphically : \n");

		for ( Payable currentPayable: payableObjects )
		{
			System.out.printf( "%s \n%s: $%,.2f\n\n", currentPayable.toString( ), "payment due", currentPayable.getPaymentAmount( ));
		}

	}
}
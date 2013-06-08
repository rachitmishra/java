//PolymorphismTest.java
//Assigning superclass and subclass references to superclass and subclass variables.

public class PolymorphismTest {
	public static void main(String[] args) {
		CommissionEmployee commissionEmployee = 
		new CommissionEmployee ( "Daniel", "Jones", "222-222-3232", 10000, .06 );
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
		new BasePlusCommissionEmployee ( "Mariam", "Sheikh", "222-232-3221", 5000, .04, 300 );
		CommissionEmployee commissionEmployee2 = 
		basePlusCommissionEmployee;
		System.out.printf( "%s %s: \n\n%s\n\n ", "Call CommissionEmployee's toString with superclass reference ",
			"to superclass object", commissionEmployee.toString( ));
		System.out.printf( "%s %s: \n\n%s\n\n ", "Call BasePlusCommissionEmployee's toString with subclass reference ",
			"to subclass object", basePlusCommissionEmployee.toString( ));
		System.out.printf( "%s %s: \n\n%s\n\n ", "Call BasePlusCommissionEmployee's toString with superclass reference ",
			"to subclass object", commissionEmployee2.toString( ));

	}
}
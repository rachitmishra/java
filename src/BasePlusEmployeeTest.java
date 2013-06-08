
public class BasePlusEmployeeTest {
	public static void main(String[] args) {
		BasePlusEmployee employee = new BasePlusEmployee ("John", "Swami", "223-322-3232" ,10000, .06, 300 );

		System.out.println ( "\nEmployee information obtained by get Method : ");
		System.out.printf( "%s %s\n", "First name is ", employee.getFirstName( ));
		System.out.printf( "%s %s\n", "Last name is ", employee.getLastName( ));
		System.out.printf( "%s %s\n", "Social security number is ", employee.getSocialSecurityNumber( ));
		System.out.printf( "%s %s\n", "Gross sales is ", employee.getGrossSales( ));
		System.out.printf( "%s %s\n", "Commission rate is ", employee.getCommissionRate( ));
		System.out.printf( "%s %s\n", "Base salary is ", employee.getBaseSalary( ));

		employee.setBaseSalary( 1000 );

		System.out.printf ( "\n%s : \n\n %s\n", "Updated Employee information obtained by toString", employee );
	}
	
}
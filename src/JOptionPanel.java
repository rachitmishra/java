import javax.swing.JOptionPane;

public class JOptionPanel {
	public static void main(String[] args) {
		String firstNumber = JOptionPane.showInputDialog ( "Enter Firstnumber: ");
		String secondNumber = JOptionPane.showInputDialog ( "Enter secondnumber: ");

		int sum = Integer.parseInt( firstNumber ) + Integer.parseInt ( secondNumber);

		JOptionPane.showMessageDialog( null, "The sum is: "+sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE );
	}
}
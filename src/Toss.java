import java.util.*;

public class Toss {
	public static void Flip_Show () {
		String Result;
		Random randomnumbers = new Random ();
		int number = randomnumbers.nextInt(2);
		if (number == 0)
			Result = "Heads";
		else 
			Result = "Tails";
		System.out.println(Result);
	}
		public static void main(String[] args) {
		String uchoice;
		do {
		Toss.Flip_Show();

		System.out.println("Do You Want to Continue : (YES/NO)");
		Scanner choice = new Scanner ( System.in );
		uchoice = choice.nextLine();
	}while (uchoice=="Yes"OR"YES");

	}
}
import java.util.*;
public class DiceRoll {
	
	public void printer() {
		 Random randomNumbers = new Random();
	     
	     for (int i = 1; i<=18; i++)
	     {  
	     	int x = randomNumbers.nextInt(6);
	     	System.out.print(1+x);

	     	if(i%6==0)
	     		System.out.println("");
	     }
         


	}

	public static void main(String[] args) {
		DiceRoll dice = new DiceRoll();
		dice.printer();
	}
}
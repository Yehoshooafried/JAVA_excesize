
package targilimchapter3;
import java.util.Scanner;

public class Targil6 {
	  public static void main(String[] args) {
//		  targil4 
//		  pseudo code
//	    1. Print to the screen "What is the number of adults"
//	    2. Get the number from the user, multiply by 20 and save as X
//		3. Print to the screen "What is the number of children"
//		4. Get the number of children from the user, multiply by 12 and save as Y
//		5. Calculate X+Y and save as SUM
//		6. Print the SUM to the screen.
	  
		  Scanner in = new Scanner(System.in);
		  System.out.println("how many adults u have?");
		int adults = in.nextInt() * 20;
		 System.out.println("how many children u have?");
		 int children = in.nextInt() * 12;
		 int total = children + adults;
		  System.out.println(total);

	        }
};

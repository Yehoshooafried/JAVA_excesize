
package targilimchapter3;
import java.util.Scanner;

public class Targil3_5_1 {
	  public static void main(String[] args) {
//
//		  Pseudo code
//		  1. Print to the screen a request to receive the number of forms
//		  2. Save the result as X
//		  3. Multiply X by 6.3
//		  4. Save the result as TOTAL
//		  F. Print TOTAL
		  System.out.println("please enter the nomber of forms");
		  Scanner in = new Scanner(System.in);
		 int forms = in.nextInt();
		float  total = (float) (forms * 6.3);
		System.out.println(total);
	        }
};

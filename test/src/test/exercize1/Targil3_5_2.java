
package targilimchapter3;
import java.util.Scanner;

public class Targil3_5_2 {
	  public static void main(String[] args) {
		  
//		  Algorithm for calculating the area of a circle enclosed within a square given the length of the side of the square
//
//		  1. Divide the length of the side by 2
//		  2. Multiply the result by itself.
//		  3. Multiply the result by 3.14
		  System.out.println("Please type the length of the side of the square ");
		  Scanner in = new Scanner(System.in);
		int side = in.nextInt();
		float  area = (float) (((side/2)*(side/2)) * 3.14) ;
		System.out.println(area);
	        };
};

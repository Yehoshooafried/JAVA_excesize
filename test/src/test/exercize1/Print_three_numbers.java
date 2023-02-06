
package targilimchapter3;
import java.util.Scanner;

public class Print_three_numbers {
	  public static void main(String[] args) {

		  Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
	
		System.out.println(a + " " + b + " " + c );
		System.out.println(a + " " + c + " " + b );
		System.out.println(b + " " + a + " " + c );
		System.out.println(b + " " + c + " " + a );
		System.out.println(c + " " + a + " " + b );
		System.out.println(c + " " + b + " " + a );
		
	  };	
};

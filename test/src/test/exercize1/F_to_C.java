
package test.exercize1;

import java.util.Scanner;

public class F_to_C {
	public static void main(String[] args) {

//		  1. Algorithm from F to C
//		  1. Subtract from F 32
//		  2. Multiply the result by 5.
//		  3. Divide the result by 9

		System.out.println("Fahrenheit:");
		Scanner in = new Scanner(System.in);
		int f = in.nextInt();
		float c = ((f - 32) * 5) / 9;
		System.out.println(c);

	};
};

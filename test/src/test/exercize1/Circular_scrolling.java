
package test.exercize1;

import java.util.Scanner;

public class Circular_scrolling {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x, y, z, s;
		System.out.println("enter first element");
		x = in.nextInt();
		System.out.println("enter second element");
		y = in.nextInt();
		System.out.println("enter third element");
		z = in.nextInt();
//	solution 1
//		 s = z;
//		 z = y;
//		 y = x;
//		 x = s;

//		 solution 2
		System.out.println(z + " " + x + " " + y);

	};
};

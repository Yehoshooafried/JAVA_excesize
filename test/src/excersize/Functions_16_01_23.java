package tirgul21_12;

import java.util.Scanner;

public class Functions_16_01_23 {

	// 1

	public static void f(int k) {
		System.out.println("f: k = " + k);
		k = 3;
	}

	public static int g(int k) {
		System.out.println("g: k = " + k);
		k = k * 2;
		return 7;
	}

	public static int h(int k) {
		System.out.println("h: k = " + k);
		if (k == 0) {
			System.out.println("return 1");
			return 1;
		} else {
			System.out.println("return 0");
			return 0;
		}
	}

	public static int h1(int k) {
		int i;
		System.out.println("h1: k = " + k);
		if (k == 0) {
			System.out.println("return 1");
			return 1;
		} else {
			i = h1(0);
			System.out.println("return 1" + i);
			return i;
		}

	}

	// 1

	// 2

	public static double max(double a, double b, double c) {
		if (a <= b) {
			if (b <= c) {
				return c;
			} else {
				return b;
			}
		} else {
			if (a >= c) {
				return a;
			} else {
				return c;
			}
		}
	}

	public static double min(double a, double b, double c) {
		if (a >= b) {
			if (b >= c) {
				return c;
			} else {
				return b;
			}
		} else {
			if (a <= c) {
				return a;
			} else {
				return c;
			}
		}
	}

	// 2

	// 3
	public static int flipNUm(int num) {
		int temp = num;
		int dig;
		int flip = 0;
		int power = 0;

		// get the power
		while (temp / 10 != 0) {
			temp /= 10;
			power++;
		}

		while (num != 0) {
			dig = num % 10;
			flip += dig * (Math.pow(10, power));
			power--;
			num /= 10;

		}
//		System.out.println(flip);
		return flip;
	}

	public static Boolean isFolindrom(int num) {

		if (num == flipNUm(num)) {

			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}

	// 3

	// 4

	public static int countDig(int dig, int num) {
		int counter = 0;
		// Error handling
		if (dig / 10 > 0) {
			System.out.println("ILIGALE DIGIT");
			return -1;
		}

		if (num <= 0) {
			System.out.println("ILIGALE NUM");
			return -1;
		}
		while (num != 0) {
			if (num % 10 == dig) {
				counter++;
			}
			num /= 10;
		}
//		System.err.println(counter);
		return counter;

	}

	// 4a
	public static boolean noDup(int num) {
		int dig;
		int temp;

		while (num != 0) {
			dig = num % 10;

			temp = num / 10;
			while (temp != 0) {
				if (temp % 10 == dig) {
//					System.out.println(false);
					return false;
				}
				temp /= 10;
			}
			num /= 10;
		}
//		System.out.println(true);
		return true;
	}

	// 4a

	
	//4b
	public static int sumCounters(int digits, int num) {
		 int sumOfCounters = 0;
		if (noDup(digits)==false) {
			System.out.println("ILIGAL DIGITS");
			return -1;
		}
		
		while (digits != 0 ) {
			sumOfCounters += countDig(digits%10, num);
			digits /=10;
		}
		System.out.println(sumOfCounters);
	return sumOfCounters;
	}
	
	//4b
	
	
	// 4

	
	//5
	
	
	//5
	
	public static void main(String[] args) {
		sumCounters(12, 33331222);
		
//		noDup(100);
//		countDig(1, 100);
//  flipNUm(12321);
//		isFolindrom(12021);
//		System.out.println(min(3,1,2));
//		Scanner in = new Scanner(System.in);
//		int k;
//		k = in.nextInt();
//		
//
//		System.out.println("main: k = " + k);
//	g(int k);
//		System.out.println("main: k = " + k);

	}

}

package excersize;

public class Recurse {

	public static int sumOfDigit(int num) {
		int sum = 0;
		if (num < 10) {
			return num;
		} else {
			sum = sumOfDigit(num / 10);
			sum += num % 10;
			return sum;
		}

	}

	public static int productOfeven(int num) {
		int product = 1;
		if (num < 10) {
			if (num % 2 == 0) {
				return num;
			} else {
				return 1;
			}

		} else {

			product = productOfeven(num / 10);

			if ((num % 10) % 2 == 0) {

				return product * num % 10;

			} else {
				return product;
			}

		}

	}

//	public static void print(int num ) {
//		if (num == 1) {
//			System.out.println("*");
//		} else {
//			for (int i = 0; i < num; i++) {
//				System.out.print("*");
//			}
//			
//			System.out.println(" ");
////			print(num - 1);
//
//		}
		
		public static void printD(int a, int b ) {
			if (a == b) {
				for (int i = 0; i < b; i++) {
					System.out.print("*");
				}
			} else {
				
				
				for (int i = 0; i < b; i++) {
					System.out.print("*");
				}
				System.out.println(" ");
				printD(a,b+1);
				
				
			}

	}

	public static void main(String[] args) {

		printD(6,4);
	}
}

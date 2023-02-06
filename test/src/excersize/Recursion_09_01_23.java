package excersize;

public class Recursion_09_01_23 {
//1
	public static boolean digEven(int num, int dig) {
		boolean isEven;

		if (num / 10 == 0) {
			if (num == dig) {
				return false;
			}
			return true;
		} else {
			isEven = digEven(num / 10, dig);
			if (num % 10 == dig) {
				isEven = !isEven;
			}
			return isEven;
		}

	} // 1

	// 2

	public static void binary(int num) {
		if (num / 2 == 0) {
			System.out.print(num % 2);
		} else {
			binary(num / 2);
			System.out.print(num % 2);
		}
	}
	// 2

	// 3
	public static boolean duplicated(int arr[] ,int length,int num) {
		boolean isDo = false ;
		int temp = 0;
		if() {}
		isDo = duplicated(arr,length-1,num);
		for() {}
	}

	// 3
	public static void main(String[] args) {
		// binary(64);
//		System.out.println(digEven(122223, 2)); 
	}

}

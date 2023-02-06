package excersize;

import java.util.Iterator;

public class Tirgul_recursion {

	// 1 return the number of even digits
	public static int evenDigits(int num) {

		int counter = 0;

		if (num / 10 == 0) {

			if (num % 2 == 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			counter = evenDigits(num / 10);

			if ((num % 10) % 2 == 0) {

				return ++counter;
			}
			return counter;
		}

	}
	// 1

	// 2 check if all odd
	public static boolean isAllEven(int num) {

		boolean isEven;
		if (num / 10 == 0) {

			if (num % 2 != 0) {
				return true;
			} else {
				return false;
			}
		} else {

			isEven = isAllEven(num / 10);

			if ((num % 10) % 2 != 0 && isEven) {
				return true;
			} else {
				return false;
			}

		}

	}// 2

	// 3 print Right angled trapezoid
	public static void printTrapezoid(int a, int b) {

		if (a == b) {
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
		} else {
			printTrapezoid(a, b - 1);

			System.out.println(" ");
			for (int i = 0; i < b; i++) {

				System.out.print("*");
			}
		}
	}

	// 4
	public static int evenArrey(int[] arr, int i) {
	
		int counter = 0;

		if (i == 0) {
			if (arr[0] % 2 == 0) {
				return 1;
			} else {
				return 0;
			}
		} else {

			counter = evenArrey(arr, i - 1);
			if (arr[i] % 2 == 0) {
				return counter+1;
			} else {
				return counter;
			}
		}
	}//4
	
	
	//5 
	public static boolean alternate(int[]arr,int i) {
		
		boolean isAlternate;
		
		if(i == 0 ) {
			
			if((arr[0]%2) != (arr[1]%2)) {
				return true;
			}
			else {
				return false;
			}
			
		}else {
			isAlternate = alternate(arr, i-1);
			if(isAlternate && arr[i-1]%2 != arr[i]%2 ) {
				return true;
			}else {
				return false;
			}
		}

	}//5
	
	//6 

	public static void main(String[] args) {
 
		
		
		 int [] arr = new int[3];
		 for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		 arr[0]=1;
//5System.out.println(alternate(arr, arr.length-1)) ;		 
//4		 
//		 for (int i = 0; i < arr.length; i++) {
//			arr[i] = i;
//		}


		 
//4	evenArrey(arr, arr.length-1);	

//3 	printTrapezoid(2, 2);
//2	if(isAllEven(111121)) System.out.println("all  Odd") ;
//		else System.out.println("not all even");
//1	System.out.println(evenDigits(123465)) ;


	}

}

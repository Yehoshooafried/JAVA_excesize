package excersize;

import java.util.Iterator;
import java.util.Scanner;

public class tirgul_3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);



		/*
		 * // 1 // algorithm 1.get a number from the user as num 2. create array that
		 * iterate until i <= num 3.every iterate add power i to number
		 * 
		 */

//		 int num, total;
//		 total = 0;
//		 num = in.nextInt();
//		for (int i = 1; i <= num; i++) {
//		
//			total += Math.pow(i, 2);
//		}
//		System.out.println(total);
		// end exesize 1

		// 2 //
//		algorithm
//		  1.
//		  2. create array that iterate until i <= num
//		  3.every iterate add power i to number 
//		  
//		  */
//		int num, k, moduloZero, test_num;
//		num = in.nextInt();
//		k = in.nextInt();
//		moduloZero = 0;
//		while (num > 0) {
//			test_num = num%10;
//			if(k % test_num == 0) {
//			moduloZero ++;
//			}
//			num /= 10;
//		}
//		
//		System.out.println(moduloZero);
		// end exesize 2

//		// 3 //

//		int max, min, even, odd, num_for_max, num, i, sum, olderNUmber, is_empty;
//		double avg;
//		String massege;
//
//		num = 0;
//		max = 0;
//		min = 0;
//		sum = 0;
//		even = 0;
//		odd = 0;
//		avg = 0;
//		olderNUmber = 0;
//		is_empty = 0;
//		
//		for (i = 1; num != -1; i++) {
//			
//			num = in.nextInt();
//
//			if (num >= 0) {
//				is_empty++;
//				// chack tha max number
//				max = Math.max(max, num);
//
//				// chack tha min number
//				min = Math.min(olderNUmber, num);
//				olderNUmber = num;
//
//				if (num % 2 == 0) {// chack if even or odd
//					even++;
//				} else
//					odd++;
//
//				// getting the average
//				sum += num;
//				avg = ((double)sum / i);
//			}
//		}
//if(is_empty > 1 ) {
//	System.out
//				.println("max:" + max + " min:" + min + " sum:" + sum + "avg:" + avg + " even:" + even + " odd" + odd);
//}else {
//	System.out
//	.println(" your series is empty");
//}
		
		// end exesize 3
		
//	     // 4 //
		
//			char operator;
//			double result,a, b;
//			result= 0;
//			a = in.nextInt();
//			operator = in.next().charAt(0);
//			b = in.nextInt();
	//	
//			
	//
	//if(a == 0 && b == 0 && operator == '/') {
//		System.out.println("invalid arithmic ");
	//}else {
//		switch (operator) {
//		case '+':
//			 System.out.println((a + b));
//			break;
//		case '-':
//			System.out.println((a - b));
//			break;
//		case '*':
//			System.out.println((a * b));
//			break;
//		case '/':
//			System.out.println((a / b));
//			break;
//		case '%':
//			System.out.println((a % b));
//			break;
	//
//		default: System.out.println("invalid arithmic ");
//			break;
//		}
	//}
//			
			
			// end exercize 4
	}
}

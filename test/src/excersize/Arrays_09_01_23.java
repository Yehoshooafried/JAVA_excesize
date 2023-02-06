package excersize;

import java.util.Scanner;

public class Arrays_09_01_23 {
	public static double avg() {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[6];
		double sum = 0;
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[arr.length - 1]) {
				counter++;
				sum += arr[i];
			}
		}
		return sum / counter;

	}

//2
	public static void howMany(int num) {
		int[] arr = new int[10];
//int i;
// Create array of number from 0 to 9

//	for ( i = 0; i < arr.length; i++) {
//		arr[i] = i;
//	}
		// check the number

		while (num != 0) {

			arr[num % 10]++;
			num /= 10;
		}
		// print the array when the value > 0
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				System.out.println("the number " + j + "apears " + arr[j] + " times");
			}
		}
	}
//2

//3

	public static int findMissing(int arr[], int n) {
		int missing = 0;
		boolean notMissing;
		int fullArr[] = new int[n];

		// creat fullArr
		for (int i = 0; i < n; i++) {
			fullArr[i] = i + 1;
		}

		// check if missing
		for (int i = 0; i < fullArr.length; i++) {
			notMissing = false;
			for (int j = 0; j < arr.length; j++) {
				if (fullArr[i] == arr[j]) {
					notMissing = true;
				}
			}
			if (notMissing == false) {
				missing = fullArr[i];
			}
		}
		System.out.println(missing);
		return missing;
	}

//3

	// 4

	public static void binarySeries() {
		Scanner in = new Scanner(System.in);
		int num;
		int counter = 0;
		int[] arrCounters = new int[12];
//		int [] arrSeries = new int [12];
		for (int i = 0; i < arrCounters.length; i++) {
			num = in.nextInt();
			if (num == 1) {
				counter++;
				if (i == arrCounters.length - 1) {
					arrCounters[counter - 1] += counter;
				}
			} else {
				if (counter > 0) {
					arrCounters[counter] += counter;
					counter = 0;
				}

			}
		}
		for (int i = 0; i < arrCounters.length; i++) {
			if (arrCounters[i] > 0) {
				System.out.println("is " + arrCounters[i] / (i + 1) + "of" + (i + 1) + "ones");
			}
		}
		System.out.println();
	}

	// 4

	// 5
	public static int midMax(float a, float b, float c) {
		if (b > a && b > c) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int countPeaks(int heights[]) {
		int counter = 0;

		for (int i = 1; i < heights.length-1; i++) {
			if (midMax((heights[i- 1] ), (heights[i] ), (heights[i + 1] )) == 1) {
				counter++;
			}		
		}
		
System.out.println(counter);
		return counter;
		
	}

	// 5

	//6
	
	
	//6
	public static void main(String[] args) {
		int[] arr = {3,9,4,5,7,8,5,3,8,6};
		countPeaks(arr);
//		binarySeries();
//	findMissing(arr, 4);	
		// howMany(1000000);
//		System.out.println(avg());

	}
}

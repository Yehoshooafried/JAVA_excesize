package excersize;

import java.util.Scanner;

public class Arrays_30_1_20 {

	public static int[] createArray(int[] arr) {
		Scanner in = new Scanner(System.in);
//		int [] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}

	public static void printElelment(int[] arr, int element) {

		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				System.out.print(i + " ");
			}
		}
	}

	public static int findMIn(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void array1() {
		int[] arr = new int[4];
		createArray(arr);
		// 2 find min
		printElelment(arr, findMIn(arr));
		// 3 print the min

	}

	public static int[] createArray3(int[] arr) {
		Scanner in = new Scanner(System.in);
		int dig = 0;
		int i = 0;
		while (dig != -1 && i < 50) {
			dig = in.nextInt();
			arr[i] = dig;
			i++;
		}
		;

		return arr;
	}

	public static int findMaxSeries(int[] arr) {
		int i = 0;
		int index = 0;
		boolean isSeries = false;
		int[] serieses = new int[50];
		int maxSeries;
		for (i = 0; i < arr.length - 1; i++) {

			if (arr[i] == -1) {
				break;
			}
			if (arr[i] >= arr[i + 1]) {
				if (isSeries == false) {
					index = i;
				}
				serieses[index]++;
				isSeries = true;
			} else {
				isSeries = false;
			}
		}
		
		maxSeries = findMax(serieses);
		return maxSeries;
	}

	public static int arrays3() {
		int maxSeries = 0;

		int[] arr = new int[10];

		arr = createArray3(arr);
		
		System.out.println(findMaxSeries(arr));
		return findMaxSeries(arr);
	}

	public static void main(String[] args) {
		arrays3();
//		array1();
	}

}

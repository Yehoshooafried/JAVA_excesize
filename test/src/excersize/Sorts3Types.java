package excersize;

public class Sorts3Types {

	public static int[] insertionSort(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i; j >= 0; j--) {
				if (arr[j + 1] > arr[j]) {
					// swap
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}

		}
		return arr;
	}

	public static int[] bubbleSort(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - (i + 1); j++) {

				if (arr[j] > arr[j + 1]) {

					// swap
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static int[] selectionSort(int[] arr) {
		int temp;
		int max = arr[0];
		int maxIndex = 0;

		for (int i = 1; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				if (arr[j] > max) {
					max = arr[j];
					maxIndex = j;
				}
				// swap
				temp = arr[maxIndex];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = temp;

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 3, 0, 7, 4, 9 };
		bubbleSort(arr);
//		insertionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}

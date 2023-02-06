package excersize;

import java.util.Scanner;

public class Sort_18_1_23 {

	Scanner in = new Scanner(System.in);

	public static void printArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void copyArr(String[] arr1, String[] arr2) {

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

	}

	public static int bubbleSort(String[] arr) {
		boolean notSorted = false;
		String temp;
		int boSCounter = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - (i + 1); j++) {
				notSorted = false;
				if (arr[j + 1].compareTo(arr[j]) < 0) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					boSCounter++;
					notSorted = true;
				}

			}
			if (notSorted == false)
				break;
		}
		return boSCounter;
	}

	public static int insrtionSort(String[] arr) {
		int inSCounter = 0;
		String temp;
		for (int i = 1; i < arr.length; i++) {

			for (int j = i; j > 0; j--) {
				if (arr[j].compareTo(arr[j - 1]) < 0) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}

		}
		return inSCounter;
	}

	public static int binarySearch(String[] arr, String word) {

		int steps = 0;
		int middle;
		int low;
		int high;
		int index = -1;
		boolean founded = false;

		low = 0;
		high = arr.length - 1;

		while (low <= high) {
			middle = (low + high) / 2;
			steps++;
			if (word.compareTo(arr[middle]) == 0) {
				index = middle;
				founded = true;
				break;
			} else if (word.compareTo(arr[middle]) < 0) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		if (founded == false)steps = -1;
			
		return steps;
	}

	public static int selectionSort(String[] arr) {
		int counter = 0;
		String temp;
		String min;
		int minIndex;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(min) < 0) {
					min = arr[j];
					minIndex = j;
				}
				// swap
				temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = arr[minIndex];
			}
		}
		return counter;
	}

	public static String[] option1() {

		Scanner in = new Scanner(System.in);
		String[] stringArr;
		String strintToBreak;
		String userInput;
		String word = "";
		String[] tempArr;
		int wordCounter = 0;
		int spaceCounter = 0;
		int stringArrIndex = 0;
		char option;

		System.out.println("enter Your Words");
		strintToBreak = in.next();
		strintToBreak += in.nextLine();

		// get string arr length
		for (int i = 0; i < strintToBreak.length(); i++) {
			if (strintToBreak.charAt(i) == ' ' && (strintToBreak.length() - i) > 1) {

				if (strintToBreak.charAt(i + 1) != ' ' && i != 0 && wordCounter > 0) {
					spaceCounter++;
				} else {
					wordCounter++;

				}
			}

		}
		System.out.println(spaceCounter);
		// get string arr length

		// creat string arr
		stringArr = new String[(spaceCounter + 2)];
		System.out.println(stringArr.length + " lengh");
		wordCounter = 0;
		for (int i = 0; i < strintToBreak.length(); i++) {
			if (strintToBreak.charAt(i) != ' ') {
				word += strintToBreak.charAt(i);
//			stringArr[stringArrIndex] = "";
//		stringArr[stringArrIndex] += strintToBreak.charAt(i);
				wordCounter++;
			}

			if ((strintToBreak.charAt(i) == ' ' && wordCounter > 0) || i == (strintToBreak.length() - 1)) {
				stringArr[stringArrIndex] = word;
				stringArrIndex++;
				word = "";
				wordCounter = 0;
			}
		} // creat string arr

//		printArr(stringArr);

		// creat temp arr and copy the original for sorting
		tempArr = new String[stringArr.length];

		// insrtion sort
		copyArr(stringArr, tempArr);
		insrtionSort(tempArr);

		// bubble sort
		copyArr(stringArr, tempArr);
		bubbleSort(tempArr);
		printArr(tempArr);

		// selectionSort
		copyArr(stringArr, tempArr);
		selectionSort(tempArr);
		return tempArr;
	}

	public static void mainSorts() {
		Scanner in = new Scanner(System.in);
		String[] stringArr;
		String strintToBreak;
		String userInput;
		String word = "";
		String temp;
		String[] tempArr=null;

		int wordCounter = 0;
		int spaceCounter = 0;
		int stringArrIndex = 0;
		char option;
		int inSCounter = 0;
		int boSCounter = 0;
		int seSCounter = 0;

		do {

			System.out.println(" 1. Create dictonary \n 2. Search a word	\n 3. Show search hierarchy \n 4. Exit. ");
			userInput = in.next();

			if (userInput.charAt(0) < '1' || userInput.charAt(0) > '4') {
				do {
					System.out.println("you should type only option from the menu");
					userInput = in.next();
				} while (userInput.charAt(0) > '1' && userInput.charAt(0) > '4');
			}

			option = userInput.charAt(0);

			if (option == '1') {
				tempArr = option1();
			}
			if (option == '2') {
				System.out.println("enter the word that u want to find");
				word = in.next();
				System.out.println(binarySearch(tempArr, word));

			}

		} while (option != '4');

	}

	// 1

	public static void main(String[] args) {
		mainSorts();
	}

}

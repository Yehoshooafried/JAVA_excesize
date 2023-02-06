package excersize;

import java.util.Iterator;

public class binarySearch {

	static char[] order(char[] arr) {
		char maxValue;
		int maxIn = 0;
		char temp;

		for (int i = 0; i < arr.length - 1; i++) {
			maxValue = arr[i];
			maxIn = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxIn]) {
					maxIn = j;
				}
				
				//Replacement
                temp = arr[i];
				arr[i] = arr[maxIn];
				arr[maxIn] = temp;
			}

		}

		return arr;

	}

	public static void main(String[] args) {
		char [] arr = new char[26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (char) (i + 'a');
		}
		
System.out.println(order(arr));
	}
}

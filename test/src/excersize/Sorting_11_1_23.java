package excersize;

public class Sorting_11_1_23 {

	public static void swap(int first, int second) {

		int temp = first;
		first = second;
		second = temp;
	}

	public static void bouobleSort(int[] arr) {

	}

	public static void sortHachnasa(int[]arr) {
		int i, j;
		int temp;
		for ( i = 0; i < arr.length-1; i++) {
			
			for ( j = i; j < i+1; j++) {
				if(arr[j+1] <arr[j]) {
//					swap(arr[j+1], arr[j]);
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = arr[j];
					
				}
			}
			
		}
	}
	public static void main(String[]args) {
		int[] arr = {5,1,3,2};
		sortHachnasa(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}

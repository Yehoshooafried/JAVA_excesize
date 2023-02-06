package ThreeDArr;

public class Mat_26_01_23 {

	private static int makeNum(int[] arr) {
	
		int newNum = 0;
		for (int i = 0; i < arr.length; i++) {
			newNum *= 10;
			newNum += arr[i];
		}

		return newNum;
	}

	public static int[] twoToOne(int[][] arr) {
		int newArr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = makeNum(arr[i]);
		}

		return newArr;
	}

	public static void main(String[] args) {
		int i, j;
		int[][] mat = new int[5][5];

	}

}

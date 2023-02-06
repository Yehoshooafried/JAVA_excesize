package SubArray;

public class SubArray {

	// Attributes
	private int[][] mat;

	// constructor
	public SubArray(int[][] mat) {
		this.mat = mat;
	}

	// private method

	private int findMin(int[][] mat) {
		int min = mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] < min) {
					min = mat[i][j];
				}
			}
		}

		return min;
	}

//	private int findK(int[][] mat) {
//		int i, j;
//		return 0;
//	}
	// methods

	public void printMat(int[][] mat) {
		System.out.println("full mat");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(" " + mat[i][j]);

			}
			System.out.println("");
		}

	}

	public void findSub(int k) {
		boolean isAk = false;
		int myI = 0, myJ = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] == k) {
					myI = i;
					myJ = j;
					isAk = true;
					break;
				}
				
			}
			
			if (isAk) {
				break;
			}
		}

		if (isAk == false) {
			System.out.println("is no such a number in the matritz");
			return;
		}
		
		System.out.println("sub: ");
		for (int i = myI; i < mat.length; i++) {
			for (int j = myJ; j < mat[i].length; j++) {
				System.out.print(" " + mat[i][j]);
			}
			System.out.println("");
		}

	}

	public void findMinSub() {
		findSub(findMin(this.mat));
	}

}

package SubArray;

public class Main {

	public static void main(String[]args) {
		int mat[][];
		mat = new int[6][6];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = (int) (0 +(Math.random() *10));
			}
		}
		mat[2][4]= 3;
		
		
		SubArray sub1 = new SubArray(mat);
		sub1.findSub(3);
		sub1.printMat(mat);
	}
}

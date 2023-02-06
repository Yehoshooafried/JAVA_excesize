package ThreeDArr;

import java.util.Scanner;

public class ThreeD {

	//creat 2D Arr
//	int[][] tDArr = new int[25][7];
	
	//insert data
	public static void insertData(int[][] arr) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
	}
	
	public static double studentAvg(int index , int[][] arr) {
		double avg;
		double sum = 0;
		
		for (int i = 0; i < arr[index-1].length; i++) {
			sum += arr[index-1][i];
		}
		
		avg = sum / arr[index-1].length ;
		
		return avg;
	}
	public static double testAvg(int test , int[][] arr) {
		double avg;
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][test -1];
		}
		
		avg = sum / arr.length ;
		
		return avg;
	}
	
	public static int max(int[][] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
				
			}
		}
		
		return max;
		
	}
	//jeneral seach and sort function
	public static void calculate(int test, int student, int[][] arr) {
		//student avg
	System.out.println("student avg" +  studentAvg(student, arr));
		 //test avg
	 System.out.println("testAvg" + testAvg(test, arr));
	 
	 System.out.println("max:" + max(arr));
	}
	
	public static void jeneral(int [][] arr) {
		Scanner in = new Scanner(System.in);
		int test, student ;
		insertData(arr);
		System.out.println("enter the test no");
	test = in.nextInt();
	System.out.println("enter the student no");
	student = in.nextInt();
	
	calculate( student, test, arr);
	}
	
	 public static void main(String[] args) {
		 int[][] tDArr = new int[3][2];
		
		 jeneral(tDArr);
	}
}

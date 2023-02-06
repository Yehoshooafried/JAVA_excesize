package tirgul21_12;
import java.util.Scanner;
public class Sorts_16_01_23 {

	//1
	public static void mainSorts() {
		Scanner in = new Scanner(System.in);
		String [] stringArr = new String [6];
		String strintToBreakString;
 		int option;
		do {
	
			System.out.println(" 1. Create dictonary \n 2. Search a word	\n 3. Show search hierarchy \n 4. Exit. ");
		option = in.nextInt();
		
		if (option == 1) {
			for (int i = 0; i < stringArr.length; i++) {
				stringArr[i] = in.next();
			}
			for (int i = 0; i < stringArr.length; i++) {
				System.out.println(stringArr[i]);
			}
			
		}
			
		} while (option != 4);
		
		
				
				

	}
	
	//1
	
	public static void main(String[]args) {
		mainSorts();
	}
	
}

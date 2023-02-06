package excersize;

public class T05_01 {

	public static void boubles(char[] charArr) {
		char temp;
		boolean sorted = true;
		for (int i = 0; i < charArr.length-1; i++) {
			sorted = true;
			for (int j = 0; j < i +( charArr.length-(i+1)); j++) {
				if (charArr[j]>charArr[j+1]) {
					temp = charArr[j];
					charArr[j] = charArr[j+1];
					charArr[j+1] = temp;
					sorted = false;
				}
				if (sorted) break;
			}
			
			
		}
	}
	
	public static void regular(char[] charArr) {
		char temp;
		char max;
		int maxIndex = 0;
		for (int i = 0; i < charArr.length-1; i++) {
			max = charArr[i];
			for (int j = i+1; j < charArr.length; j++) {
				if (charArr[j]>max) {
					max = charArr[j];
					maxIndex = j;
				}
				temp = charArr[i];
				charArr[i]= max;
				charArr[maxIndex] = temp;
			}
			
			
		}
	}
	public static void main(String[]args) {
		
	}
	
}

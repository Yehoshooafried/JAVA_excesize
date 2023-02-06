package excersize;



public class Strings_04_01 {

	// 1
	public static int toLowerCase(String str) {
		int counter = 0;
		String newString = "";
		char current;
		for (int i = 0; i < str.length(); i++) {

			current = str.charAt(i);
			if (str.charAt(i) < 'Z') {

				current = (char) (str.charAt(i) + (char) ('a' - 'A'));
				counter++;
			}

			newString += current;

		}
		System.out.println(newString);
		return counter;
	}// 1

	// 2
	public static String name(char[] str, int num) {
		int numStar = 0;
		int add;
		int digits = 0;
		String result= "";
		int current = 0;
		// get the numbers
		for (int i = 0; i < str.length; i++) {
			if (str[i] <= '0' || str[i] >= '9') {
				break;
			}
			
			numStar *= 10;
			numStar += (str[i] -'0') ;
			System.out.println(numStar);
			digits ++;
		}

		// add

		add = num + numStar;
	int temp = digits -1;
		// from number to str
	if (digits == 0) {
		result += (char) (num + '0');
	}
		for (int i = 0; i < digits; i++) {
			
			current = (int) (add / (Math.pow(10, temp)));
			result += (char) (current + '0');
			add = (int) (add %  (Math.pow(10, temp))) ;
			temp --;
		}

System.out.println(result);
		
		return result;
	}

	public static void main(String[] args) {
char[] arr = {'a','2','3'};
		name(arr, 2);
//1		System.out.println(toLowerCase("asCCNNv"));
	}

}

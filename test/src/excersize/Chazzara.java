package excersize;

import java.util.Scanner;

public class Chazzara {
	static char returnLast(String str) {
		
		
		return  str.charAt(str.length() -1) ;
		
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(returnLast("abc c"));
}
}

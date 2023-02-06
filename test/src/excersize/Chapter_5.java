package excersize;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.Scanner;

public class Chapter_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	  String sentenc, first;
		  char last_letter;
		  int num_of_words,i,space, isSpace;
		  last_letter = ' ';
		isSpace = 0;
		space = 1;
		first  = "";
		 sentenc  = in.nextLine();
		 
		for (i = 0;i<sentenc.length();i++) {
			if(sentenc.charAt(i)==' ') {
				if(space == 1) {
					last_letter = sentenc.charAt(i);
				}
				space ++;
			}
		}
		
//		
//		for (i = 0;isSpace==0;i++) {
//
//			if (sentenc.charAt(i) == ' '){
//				isSpace = i;
//				break;
//			}
//		}
//		
		 
		  
//		  last_letter = sentenc.charAt(isSpace -1);
		  System.out.println(space + " " + last_letter );
		  
//		  space + " " +
		  
		
//// 314-4 314 - num1 
//		
//		int num1, num2;
//		char op;
//		char ch;
//		num1 = 0;
//		// get the first number
//		
//		ch = in.next().charAt(0);
//		while(ch>='0'&&ch<='9') {
//			num1*=10;
//			num1+=(int)(ch-'0');
//			ch = in.next().charAt(0);
//		}
////		get the op
//		op = ch;
//// 5.46
//		int num;
//		char grade;
//		Scanner in = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) {
//			num = in.nextInt();
//			if (num >= 0) {
//				if (num == 0) {
//					grade = 'E';
//				}else {
//					if(num <=5) {
//						grade = 'C';
//					}else {
//						if (num <=10) {
//							grade = 'B';
//						}else {
//							grade = 'A';
//						}
//					}
//				}
//      System.out.println(grade);            		
//}
//			}
// if (num_of_words >10) {
//	 grade = 'A';
//} else if(num_of_words >= 6 ) {
//	grade = 'B';
//}else if(num_of_words >= 1 ) {
//	grade = 'C';
//}else grade = 'E';
		
		// end exercise  5.46
 
		}

	}


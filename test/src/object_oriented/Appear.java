package object_oriented;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;

public class Appear {
 private char ch;
 private int num;
	
 public Appear(char ch) { 
	 this.ch = ch;
	 this.num = 0;
}
 
// public Appear( int num) {
//	 this.num = num;
// }
 
 
 //setters
 
 public void setCounerNum() {
	this.num ++;
}
 
 //getters
 
 public char getCh() {
	return ch;
}
 
 public int getNum() {
	return num;
}
 
 
	
 public static Appear[] appears(String str, Appear[] apearArr) {
	 
	
	 char ch = ' ';
	
	 
	 for (int i = 0; i < apearArr.length; i++) {
		 apearArr[i] = new Appear((char)('A' + i));
	}
	 
	 for (int i = 0; i < str.length(); i++) {
		 
		 ch = str.charAt(i);
		 if (str.charAt(i)>= 'a') {
			 ch = (char) (str.charAt(i) - ('a'-'A'));
		 }
		 
		 apearArr[ch - 'A'].setCounerNum();
		}
	 
	 
	return apearArr;
	 
	 
 }
 
 public static void main(String[]args) {
	 
	 Appear[] arr = new Appear[26];
	appears("acSdzZ", arr);
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i].getCh()+""+arr[i].getNum()+" ");
//		System.out.println(arr[i].getNum());
	}
}
}

package excersize;

import java.util.Scanner;

public class Check {

	
	
	public static boolean isArrSame(char[] arr1,char[] arr2, int length1,int length2){

		boolean    isEven;

		   if(length1==0 || length2==0){

		           if( arr1[length1]==arr2[length1]){
		                   isEven = true;
		                   return isEven;
		               }else{
		                   isEven = false;
		                   return isEven;  
		                        }

		   }else{
		            isEven =  isArrSame(arr1,arr2, length1-1, length2-1);
		          if(   isEven==true && arr1[length1-1]  == arr2[length2-1] ){
		                              isEven = true;
		                              
		           }else{
		                isEven =false;
		                  }
		            return isEven;
		             }

		}
	
	
	
	
	

public static int CountSpaces(String str){
  int i;
  int counter = 0;

     for(i = 0; i < str.length(); i++){   
                 
             if ( str.charAt(i) == ' ' ){ 
                  counter++;
                   }

          }
  return counter;
}

public static String[] insertStr( String [] arr , String  str){
  int i ;
  String word = " ";
 int indexArr = 0;
    for(i = 0; i < arr.length; i++){
    	
        word += str.charAt(i);
           if(str.charAt(i) == ' '){
           indexArr++; 
            }
        }
                 return arr;
                 }


public static int sumOfChars(String[] str){
 int sum = 0; 
int i;
    for(i = 0; i < str.length; i++){
  sum+= str[i].charAt(i);
          }

 return sum;
 }
 

public static String[] sortArrMIn( String [ ]arr){
 String min;
 int minIndex;
 int i,j;
String temp;
      for(i = 0; i < arr.length; i++){

   min = arr[i];
   minIndex = i;         

           for(j = i+1; j < arr.length; j++){
              if(arr[j].compareTo( min )<0 ){
                min = arr[j];
                minIndex = j;
                    }
          
                       }
           temp = arr[i];
           arr[i] = min;
          arr[minIndex] = temp;
                }

    return arr;
           }


public static String[] sortArrMax( String []arr){
 String max;
 int maxIndex;
 int i,j;
String temp;
      for(i = 0; i < arr.length; i++){

   max = arr[i];
   maxIndex = i;         

           for(j = i+1; j < arr.length; j++){
              if(arr[j].compareTo(max  )>0 ){
                max = arr[j];
                maxIndex = j;
                    }
          
                       }
           temp = arr[i];
           arr[i] = max;
          arr[maxIndex] = temp;
                }
    return arr;
           }


public static String[ ] mainSortArr( ){
            Scanner in = new Scanner(System.in);
   String words;
 String[ ] wordsArr;
//get words

      System.out.println(" please enter the words: ");
      
     words = in.nextLine();

//get sum of words/length arr

    wordsArr = new String[ CountSpaces(words) +1];  

//insert to arr
   insertStr( wordsArr, words);

//  sum of chars and check if is Even

   if(sumOfChars(wordsArr )%2==0 ){    
      sortArrMIn( wordsArr);
     }else{
             sortArrMax( wordsArr);
            }
                               return wordsArr; 
                                         }
	public static void main(String[]args) {
	
	char[]	arr1 ={'a','b','c','g'};
	char[]  arr2 =  {'a','b','c'};
		System.out.println(isArrSame(arr1, arr2,arr1.length, arr2.length )); 
	}
}

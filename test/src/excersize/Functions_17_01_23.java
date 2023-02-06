package excersize;



public class Functions_17_01_23 {

	public static boolean checkIndex(int index) {
		if(index ==-1) {
			System.out.println("invalid indices");
			 return false;
		}
	return true;	
	}
		public static boolean checkNegative(int index, int num) {
			if(index < 0 || num < 0) {
				System.out.println("A negative number or index");
				return false;
			}
		
		
		return true;
	}
	public static boolean  checkLength(int num) {
		
		if (num >= 10) {
			System.out.println("u have more than 10 indices/numbers");
		return false;
		}
		
		return true;
	}


	public static int countNum(int num) {
		int amount = 0;
		
		while (num != 0) {
			amount++;
			num /= 10;
		}
		return amount;
	}

	public static int returnNum(int size, int index, int num) {
		int counter = size;
		int  dig = -1;
		for (int i = 0; i <= size; i++) {
			if (index == counter) {
				dig = num % 10;
				return dig;
			}
			counter--;
			num /= 10;
		}
		
		return dig;
	}

	
	public static int indices(int indices, int num) {
		int newNum = 0;
		int amountNum = 0;
		int temp = 0;
		int pow = 1;
		int countDig = 0;
		amountNum = (countNum(num) - 1);

		
		if(checkNegative(indices, num)== false) return 0;
		if(checkLength(amountNum) == false) return 0;
do {
	countDig++;
	if(checkLength(countDig) == false) return 0;	
	temp = returnNum(amountNum, (indices % 10), num);	
	if(checkIndex(temp) == false) return 0;
	temp *= pow;
	newNum += temp;
	pow *= 10;
	countDig++;
	indices /=10;
} while (indices != 0);


System.out.println(newNum);
		return newNum;
	}

	//6

	//6
	
	
	
	
	public static void main(String[] args) {
		
//System.out.println(indices(1003333333,89 )); 
	}

}

package TicTacToe;

public class Board {
private char[][] board;

public Board() {
	board = new char[3][3];
}

	public void printBoard() {
		String line = " +-+-+-+";
		char alphaIndex = 'A';
		System.out.println(" 1 2 3");
		
		
		
		for (int i = 0; i < board.length; i++) {
			System.out.println(line);
			System.out.print((char)(alphaIndex+i)+" ");
			for (int j = 0; j < board.length; j++) {
				System.out.print("|"+ board[i][j]);
			}
			System.out.print("|");
		}
//		System.out.println(line);
//		System.out.println(line);
//		
//		System.out.print("A ");
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|");
//		System.out.println();
//		System.out.print(line);
//		System.out.println();
//		
//		System.out.print("B ");
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|");
//		System.out.println();
//		System.out.print(line);
//		System.out.println();
//		
//		System.out.print("C ");
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|"+ board[0][0]);
//		System.out.print("|");
//		System.out.println();
//		System.out.print(line);
//		System.out.println();
		
		for (int i = 0; i < board.length; i++) {
			
		}
	}
	
}

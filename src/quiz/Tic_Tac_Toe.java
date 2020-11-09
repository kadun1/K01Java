package quiz;

import java.util.Scanner;

public class Tic_Tac_Toe {
	
	Scanner scanner = new Scanner(System.in);
	public char [][] board = new char[3][3];
	public int x, y;
	boolean flag = false;

	public void game() {
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = ' ';
			}
		}
		while(true) {
			xUser();
			test();
			if(flag==true) {
				showBoard();
				break;
			}
			oUser();
			test();
			if(flag==true) {
				showBoard();
				break;
			}
		}
	}
	
	void xUser() {
		while(true) {
			showBoard();
			System.out.println("X좌표를 입력하세요");
			x = scanner.nextInt();
			scanner.nextLine();
			y = scanner.nextInt();
			scanner.nextLine();
			
			if(board[x][y]!=' ') {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			else {
				board[x][y]='X';
				return;
			}
		}
	}
	void oUser() {
		while(true) {
			showBoard();
			System.out.println("O좌표를 입력하세요");
			x = scanner.nextInt();
			scanner.nextLine();
			y = scanner.nextInt();
			scanner.nextLine();
			
			if(board[x][y]!=' ') {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			else {
				board[x][y]='O';
				return;
			}
		}
	}
	
	void showBoard() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(j!=2)
				System.out.print(" "+ board[i][j] + " |");
				else System.out.print(" " + board[i][j] + " ");
			}
			System.out.println();
			if(i!=2) System.out.println("---|---|---");
		}
		
	}
	
	boolean test() {
		for(int ver=0; ver<3; ver++) {
			if(board[0][ver]=='X'&&board[1][ver]=='X'&&board[2][ver]=='X') {
				System.out.println("X승리");
				flag = true;
			}
			if(board[0][ver]=='O'&&board[1][ver]=='O'&&board[2][ver]=='O') {
				System.out.println("O승리");
				flag = true;
			}
		}
		for(int hor=0; hor<3; hor++) {
			if(board[hor][0]=='X'&&board[hor][1]=='X'&&board[hor][2]=='X') {
				System.out.println("X승리");
				flag = true;
			}
			if(board[hor][0]=='O'&&board[hor][1]=='O'&&board[hor][2]=='O') {
				System.out.println("O승리");
				flag = true;
			}
		}
		
		if(board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X'||board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X') {
			System.out.println("X승리");
			flag = true;
		}
		if(board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O'||board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O') {
			System.out.println("O승리");
			flag = true;
		}
		
		return flag;
	}
}

package quiz;

import java.util.Scanner;

public class Mytest {

	public static int highNum(int num) {
		
		int total = 1;
		int k=0;
		while(total<=num) {
			total *=2;
			k++;
		}
		return k-1;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수n을 입력하세요(0이상의 정수)");
		int inputNum = scanner.nextInt();
		
		System.out.println(highNum(inputNum));
	}
}

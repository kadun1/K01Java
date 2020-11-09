package ex04controlstatement;

import java.util.Scanner;

/*
연습3) 파일명 : Qu_04_03.java
국어,영어,수학 점수를 사용자로부터 입력받아서	평균을 구해  
90점이상 A학점, 
	80점이상 B학점,
	....
	60점미만 F학점을 출력하는 프로그램을 작성하시오.
단 switch문을 사용해야 합니다.(Scanner클래스를 사용하세요)

			99 / 10 = 9 .. 90 / 10 = 9
			89 / 10 = 8 ...					
 */
public class Qu_04_03 {

	public static void main(String[] args) {
			
		//스캐너 클래스를 사용할 준비
		Scanner scan = new Scanner(System.in);
		
		//점수
		System.out.print("국어점수:");
		int kor = scan.nextInt();
		System.out.print("수학점수:");
		int math = scan.nextInt();
		System.out.print("영어점수:");
		int eng = scan.nextInt();
		
		//평균값 구하기
		double avg = (kor + eng + math) / 3.0 ;
		System.out.println("평균점수:"+ avg);
		
		//스위치문 내에서 점수의 구간을 구함
		int result = (int)avg / 10;	// <- 핵심포인트
		switch(result) {
		case 10: case 9:
			System.out.println("A학점");break;
		case 8:
			System.out.println("B학점");break;
		case 7:
			System.out.println("C학점");break;
		case 6:
			System.out.println("D학점");break;
		default:
			System.out.println("F학점");
		}
	}
}

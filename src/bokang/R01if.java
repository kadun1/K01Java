package bokang;

import java.util.Scanner;

public class R01if {

	public static void main(String[] args) {
		
		/*
		if문 단독사용		
		 */
		int num1 = 10;
		int num2 = 20;
		if(num1<num2) {
			System.out.println("num1이 num2보다 작다");
		}
		
		//위 문장을 if~else문으로 변경하면...
		if(num1>num2) {
			System.out.println("num1은 num2보다 크다");
		}
		else {
			System.out.println("num1은 num2보다 작다");
		}
		/*
		주의]조건은 항상 if문 뒤에 나오게 된다.
		else문 뒤에는 조건이 들어가지 않는다.
		 */
		
		/*
		시나리오] 90점이상 : A학점
				80점이상~90점미만 : B학점
				나머지는 : F학점
		 */
		int jumsu = 85;
		if(jumsu >= 90) {			
			System.out.println("A학점");
		}
		else if(jumsu>=80 && jumsu<90) {
			System.out.println("B학점");
		}
		else {
			System.out.println("F학점");
		}
		
		
		
		/*
		switch문
		
		형식]	
			switch(정수식 혹은 산술식){
			case 값1:
				실행문; break;
			........
			default:
				나머지실행문;
			}
		 */
		
		/*
		시나리오] 월에 해당하는 1~12까지의 숫자를 입력받아서
			봄(3~5), 여름(6~9), 가을(10~11), 겨울(12~2)인지 판단하는 
			switch~case문을 작성해보시오.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~12사이의 정수를 입력하세요:");
		int month = scanner.nextInt();
		switch (month) {
		case 3:case 4:case 5: //if문의 or조건같은 형식
			System.out.println("3~5월은 봄입니다.");
			break;
		case 6:case 7:case 8:case 9:
			System.out.println("6~9월은 여름입니다.");
			break;
		case 10:case 11:
			System.out.println("10~11월은 가을입니다.");
			break;
		default:
			System.out.println("12~2월은 겨울입니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}
}

package ex04controlstatement;
/*
문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
파일명 : Qu_04_06.java

	실행결과]
	*
	* *
	* * *
	* * * *
	* * * * *
*/
public class Qu_04_06 {

	public static void main(String[] args) {

		int i = 1;
		while(i<=5) {			
			int j = 1;
			while(j<=5) {
				//j는 i의 갯수만큼 출력한다.
				if(i>=j) {
					System.out.print("* ");
				}				
				j++;
			}			
			i++;
			System.out.println();//한줄 출력후 줄바꿈
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

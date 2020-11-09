package ex03operator;

public class E06PrePostFixOperator {

	/*
	증감연산자
		: 변수를 +1 혹은 -1한것과 같은 결과를 반환한다. 
		주로 반복문에서 사용한다. 
		
	Prefix(전위 증가 혹은 감소) : 연산자가 변수앞에 있음
		1. 변수의값이 먼저 증가
		2. 증가한 값이 좌측으로 혹은 다른 코드에 반영됨
	Postfix(후위 증가 혹은 감소) : 연산자가 변수뒤에 있음
		1. 변수의 값이 먼저 다른 코드에 반영됨
		2. 그 후 변수의 값이 변경됨 
	 */
	public static void main(String[] args) {

		int num1 = 7;
		int num2, num3;

		num2 = ++num1; /*
					1. num1의 값이 먼저 1증가
					2. 증가된값이 num2에 대입됨.
				*/
		num3 = --num1;/*
					1. num1의 값이 먼저 1감소
					2. 감소된값이 num3에 대입됨.
					
					최종결과 : 7, 8, 7
		 		*/
		System.out.println("전위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n",
				num1, num2, num3);

		////////////////////////////////////////////////

		num1 = 7;

		num2 = num1++; 
		num3 = num1--; 
		/*
		1. num1의 값이 num2, num3에 먼저 대입
		2. num1의 값이 증가 혹은 감소함.
		최종결과 : 7, 7, 8
		 */

		System.out.println("후위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d",
				num1, num2, num3);
	}

}

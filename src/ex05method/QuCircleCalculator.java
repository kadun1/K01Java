package ex05method;
/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타(매개변수)로 전달하면 원의넓이와 둘레를 계산하여 반환하는 
메소드를 각각 정의하자. 
이를 호출하는 main 메소드를 정의하라.

메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름

 */
public class QuCircleCalculator {

	//원의넓이(반환값이 없는 형태)
	static void circleArea(double rad){
		double result = 3.14 * rad * rad;
		System.out.println("원의넓이:"+ result);
	}
	
	//원의둘레(반환값이 있는 형태)
	static double circleRound(double rad){
		double result = 2 * 3.14 * rad;
		return result;
	}
	
	public static void main(String[] args) {
		//원의넓이를 구하는 함수는 반환값이 없어 함수내에서 즉시 결과출력됨
		circleArea(10.2);
		//원의둘레를 구하는 함수는 반환값이 있으므로 값을 반환받아 출력함
		System.out.println("원의둘레:"+ circleRound(12.3));
	}

}




package ex15usefulclass;

/*
Wrapper클래스
	: 기본자료형의 데이터를 인스턴스화 할때 사용하는 클래스
	-오토박싱 : 기본자료형이 참조형으로 자동 변환되는것
	-오토언박싱 : 참조형이 기본자료형으로 자동 변환되는것.
	※JDK1.5 이상에서 적용된다. 
 */
public class E01WrapperClass1 {

	public static void main(String[] args) {

		//일반적인 정수의 연산
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println("result="+ result);

		/*
		JDK1.4 이전 버전에서의 코딩형태
		클래스를 통해 객체화하고, intValue()를 통해 기본자료형으로
		변환한다. 
		 */
		Integer n10Obj = new Integer(10); 
		Integer n20Obj = new Integer(num2); 
		int result2 = n10Obj.intValue() + n20Obj.intValue();
		System.out.println("result2="+ result2);

		Integer resultObj = new Integer(result2);
		System.out.println("결과값을 byte형 값으로 변경:"+
				resultObj.byteValue());
		System.out.println("결과값을 이진수로 변경:"+
				Integer.toBinaryString(result2));

		//JDK1.5 이후 버전에서의 코딩형태
		Integer numObj1 = 100; //오토박싱 처리(형변환 아님)
		Integer numObj2 = 200;
		int num3 = numObj1; 
		int result3 = numObj1 - numObj2; //오토언박싱 처리
		System.out.println("오토언박싱 이후 연산결과:"+ result3);
 
		
		/*
		Wrapper 클래스에서 제공되는 메소드
			: 진법변환, int형으로 표현가능한 범위 등의 기능을 제공한다.
		 */
		System.out.println("int형의 최대값:"+ Integer.MAX_VALUE);
		System.out.println("int형의 최소값:"+ Integer.MIN_VALUE);
		System.out.println("10을 2진수로:"+	
				Integer.toBinaryString(10));
		System.out.println("10을 8진수로:"+ 
				Integer.toOctalString(10));
		System.out.println("10을 16진수로:"+ 
				Integer.toHexString(10));
				
		/*
		자바의 모든 클래스는 Object클래스를 상속받는다. 
		그러므로 아래 메소드를 사용할 수 있다. 
		
		toString() : 인스턴스 변수를 출력시 참조값이 아니라 실제 
			저장된 값을 문자열 형태로 반환해준다.
		hashCode() : 객체를 구별하기 위해 참조값을 고유한 정수값으로
			반환해준다.
		 */
		Integer numObj = new Integer(99);
		System.out.println("numObj="+ numObj);
		System.out.println("numObj.toString()="+ numObj.toString());
		System.out.println("numObj.hashCode()="+ numObj.hashCode());
		System.out.println(numObj + 1); //100
		System.out.println(numObj.toString() + 1); //"99"+1 => 991 

	}

}

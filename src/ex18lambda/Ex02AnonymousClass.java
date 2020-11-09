package ex18lambda;

/*
일반적인 인터페이스와 클래스를 활용한 오버라이딩
 */
interface IKosmo2 {
	/*
	인터페이스에 정의된 메소드는 public abstract로 선언된다. 
	 */
	void studyLambda(String str);
}
 
public class Ex02AnonymousClass {

	public static void main(String[] args) {
		
		//IKosmo2 인터페이스를 구현한 익명클래스 정의
		// 	: 구현과 객체생성 등의 문장이 생략되어 훨씬 간단하게 구현되었다.
		IKosmo2 kosmo = new IKosmo2() {
			
			@Override
			public void studyLambda(String str) {
				System.out.println(str+"을 공부하기 위해 익명클래스를 만들어요.");
			}
		};
		kosmo.studyLambda("람다식");
	}
}













package ex18lambda;

/*
함수형 인터페이스
	: 람다식을 구현하기 위해서는 먼저 인터페이스를 만들고
	람다식으로 구현할 추상메소드를 선언한다. 이를 람다식을
	만들기위한 함수형인터페이스라고 한다. 
	※ 함수형인터페이스에는 오직 하나의 추상메소드만 선언할
	수 있다.

@FunctionalInterface
	: 함수형 인터페이스의 조건을 갖추었는지에 대한 검사를 
	컴파일러에게 요청하는 역할을 하는 어노테이션
 */
@FunctionalInterface
interface IKosmo4 {	
	void studyLambda(String str);
}

public class Ex04FunctionalInterface {

	/*
	매개변수의 타입이 IKosmo4를 구현(implements)한 람다식 자체를
	전달하여 해당 함수에서 studyLambda()를 호출하여 실행한다. 
	 */
	static void execute(IKosmo4 ko, String s) { 
				
		ko.studyLambda(s);
	}
	
	public static void main(String[] args) {		
		IKosmo4 kosmo = (str) -> 
			System.out.println("IKosmo4를 구현받아 정의한 람다입니다."+str);
		
		//위의 람다식을 메소드의 매개변수로 전달하여 실행한다. 
		execute(kosmo, "\n람다를 매개변수로 전달합니다.");
		
		//람다식을 매개변수로 전달하지 않고 즉시 실행함.
		kosmo.studyLambda("\n바로 실행합니다.");
	}
}




















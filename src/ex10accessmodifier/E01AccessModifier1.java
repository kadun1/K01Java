package ex10accessmodifier;

/*
class를 정의할때는 반드시 public과 default(생략형)만 
사용해야 한다. 
*/
/*private class PrivateClass1 {	
	void myFunc() {
		System.out.println("나는 정의할수 없는 Class");
	}	
}*/
 
/*
접근지정자를 생략했으므로 default클래스로 지정된다. 
해당 클래스는 동일 패키지 내에서만 접근가능하다. 
 */
class DefaultClass1 {	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");
	}	
}

/*
public클래스는 해당 java파일을 대표하는 클래스로 파일명과 동일하고
다른 패키지에서도 접근이 가능하다. public클래스는 하나의 자바파일에
하나만 정의할수 있다. 
 */
public class E01AccessModifier1 {
	
	//멤버변수를 각각의 접근지정자를 통해 선언
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	/*
	동일 클래스내에서는 private 멤버라 할지라도 접근이 가능하다. 
	즉 동일클래스면 접근지정자에 영향을 받지 않는다.   
	 */
	 
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메소드 호출");
	}
	
	/*
	private 으로 선언된 멤버(변수 혹은 메소드)를 외부클래스에서 
	접근하고 싶을때는 public으로 선언된 멤버메소드를 이용해서 
	간접적으로 접근할 수 있다. 
	 */
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}	
}




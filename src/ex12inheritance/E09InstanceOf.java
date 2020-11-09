package ex12inheritance;

/*
instanceof 연산자
	: 인스턴스 변수가 어떤 타입의 변수인지를 판단하는 연산자로
	형변환(즉 상속관계가 있으면)이 가능하면 true, 아니면 
	false를 반환한다. 
	-객체간의 형변환이 되려면 반드시 두 클래스간에 상속관계가
	있어야 한다.
	-부모클래스의 참조변수로 자식객체를 참조할 수 있으므로,
	매개변수로 전달된 인자가 어떤 타입인지 확인할때 주로 사용된다.
 */
class Box {
	public void boxWrap() {
		System.out.println("Box로 포장합니다");
	}
}
class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("PaperBox로 포장합니다");
	}
}
class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("GoldPaperBox로 포장합니다");
	}
}

public class E09InstanceOf {
	
	/*
	-여기서 instanceof 연산자를 통해 형변환 가능여부를 판단하는 
	이유는 전달된 매개변수를 최상위 클래스인 Box타입으로 받고있기
	때문이다. 
	-Box타입으로 인자를 받게되면 자동으로 업케스팅(자동형변환)이
	되기때문에 자식클래스의 멤버메소드를 호출할 수 없게된다. 
	-이때 자식의 멤버메소드를 호출하기 위해서 다운캐스팅(명시적형변환)이
	필요하다.
	-따라서 전달된 인자를 각각의 타입으로 형변환이 가능한지 판단한 후
	다운캐스팅을 진행하고 각 클래스의 멤버메소드를 호출할 수 있게된다.  
	 */
	static void wrapBox(Box b) {		
		if(b instanceof GoldPaperBox) {
			((GoldPaperBox) b).goldWrap();
		}
		else if(b instanceof PaperBox) {
			((PaperBox) b).paperWrap();
		}
		else if(b instanceof Box) {
			b.boxWrap();
		}
			
		//기본자료형의 강제(명시적)형변환
		int num1 = (int)1.0;
		//기본자료형의 자동형변환
		double num2 = 1;
	}
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);//Box타입의 매개변수 
		wrapBox(box2);//PaperBox타입의 매개변수
		wrapBox(box3);//GoldPaperBox타입의 매개변수		
		
		String str = new String("착한박스");
		//wrapBox(str); //String객체와는 상속관계가 없으므로 호출불가
	}
}
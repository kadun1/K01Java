package ex12inheritance;

class Point
{
   	int xDot, yDot;
   	public Point(int x, int y)
   	{
 		xDot=x;
 		yDot=y;
   	}
   	public void showPointInfo()
   	{
 		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	//생성자
	/*
	반지름을 표현하는 radian과 중심좌표를 표현한 Point객체 생성을 위해
	총 3개의 인자가 필요
	 */
	public Circle(int x, int y, int rad) {//x좌표, y좌표, 반지름
		radian = rad;
		//멤버변수가 객체이므로 new를 이용해서 새로운 객체를 생성한다.
		center = new Point(x, y);
	}
	
	//정보출력용 멤버메소드
	public void showCircleInfo() {
		/*
		반지름과 중심좌표를 출력할때 중심좌표는 Point클래스에 
		정의된 메소드를 호출한다.
		 */
		System.out.println("반지름:"+ radian);
		center.showPointInfo();
	}	
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	//생성자
	public Ring(int inX, int inY, int inRad, 
			int outX, int outY, int outRad) {	
		/*
		멤버변수인 Circle객체를 각각 초기화한다.
		 */
		innerCircle = new Circle(inX, inY, inRad);
		outerCircle = new Circle(outX, outY, outRad);
	}
	//정보출력용 멤버메소드
	public void showRingInfo() {
		/*
		각각의 객체가 상속관계가 아니므로 각 객체를 통해 멤버메소드를
		호출해야 한다. 
		 */
		System.out.println("안쪽원:");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원:");
		outerCircle.showCircleInfo();
	}
}
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}


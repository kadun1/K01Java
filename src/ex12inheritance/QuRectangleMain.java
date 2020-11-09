package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
	//멤버변수
	int width; //가로 변의 길이
	int height; //세로 변의 길이
	
    //생성자
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	//사각형의 넓이 출력
	public void showAreaInfo() {
		System.out.println("직사각형넓이:"+ (width*height));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
    /*
        생성자 : 정사각형은 가로, 세로의 길이가 동일하므로 인자값 1개로
        	부모의 멤버변수 2개를 초기화할수 있도록 구성한다.
     */
	public Square(int width) {
		super(width, width);
	}
	
	/*
	사각형의 넓이를 구하는 공식은 동일하나 직사각형, 정사각형의
	면적을 출력해야 하므로 오버라이딩 처리한다. 
	 */
	@Override
	public void showAreaInfo() {
		System.out.println("정사각형넓이:"+(width*height));
	}
} 
class QuRectangleMain
{
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.showAreaInfo();

     	Square sqr = new Square(7);
     	sqr.showAreaInfo();
 	}
}


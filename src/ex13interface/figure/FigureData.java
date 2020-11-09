package ex13interface.figure;

/*
가로, 세로 길이를 가지고 있는 클래스로
차후 삼각형 혹은 사각형에서 상속받아 사용할 클래스
 */
public class FigureData {
	
	int width, height;//가로(밑변), 세로(높이)를 표현

	public FigureData(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

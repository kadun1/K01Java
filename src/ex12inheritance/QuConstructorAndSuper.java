package ex12inheritance;

class Car
{
   	int gasoline;
   	public Car(int gas) {
   		gasoline = gas;
   		System.out.println("Car 생성자 호출");
   	}
}
class HybridCar extends Car
{
    int electric;
    
    public HybridCar(int gas, int ele) {
		super(gas);
		electric = ele;
		System.out.println("HybridCar 생성자 호출");
	}
}
class HybridWaterCar extends HybridCar
{
    int water;
    
    public HybridWaterCar(int gas, int ele, int wat) {
    	//부모클래스로 gas, ele를 전달하여 생성자 호출
		super(gas, ele);
		//wat로 멤버변수 초기화
		water = wat;
		System.out.println("HybridWaterCar 생성자 호출");
	}
 
    public void showNowGauge()
    {
    	System.out.println("남은가솔린:"+gasoline);
     	System.out.println("남은전기량:"+electric);
     	System.out.println("남은워터량:"+water);
   	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		//최하위 클래스를 통해 객체생성시 3개의 매개변수 필요함.
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}


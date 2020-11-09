package ex10accessmodifier;

//과일판매자를 추상화한 클래스
class FruitSeller{
	
	private int numOfApple; //판매자의 사과 보유갯수
	private int myMoney;  //판매수익
	private final int APPLE_PRICE; //사과의 단가
	/*
	상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	일반적인 멤버메소드에서는 초기화 할수 없다. 
	하지만 생성자 메소드에서는 초기화가 가능하다. 
	마음대로 호출할수 없고, 객체생성시 단 한번만 호출되는
	특성이 동일하기 때문에 한번이상 초기화되지 않음이 보장되기 
	때문이다. 
	 */
	public FruitSeller(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
		 
	public int saleApple(int money) {				
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재상태를 출력하는 멤버메소드
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}
 
//구매자를 표현한 클래스
class FruitBuyer{

	private int myMoney ; //보유금액  
	private int numOfApple ; //구매한 사과의 갯수

	public FruitBuyer(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E03InfomationHiding {
	
	public static void main(String[] args) {

		/*
		초기화메소드를 정의하였으므로, 각각 성격이 다른 객체들을 
		생성할수 있다. 
		 */
		//판매자1 : 보유갯수 100개, 단가 1000원
		FruitSeller seller1 = new FruitSeller(0, 100, 1000);

		//판매자2 : 보유갯수 80개, 단가 500원
		FruitSeller seller2 = new FruitSeller(0, 80, 500);

		FruitBuyer buyer = new FruitBuyer(10000, 0);

		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

		//판매자1, 판매자2 에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);

		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();	 
		
		/*
		멤버변수를 private으로 선언하면 외부클래스에서는 접근이 불가능하므로
		아래 코드는 에러가 발생된다. 
		즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고, 멤버메소드를
		통해서만 구매가 이뤄질수 있도록 구현한다. 
		 */
//		seller1.myMoney += 1000; //판매자1에게 1000원을 지불하고
//		seller1.numOfApple -= 50; //사과 50개를 구매했다.
//		buyer.numOfApple += 50;
//		
//		seller2.myMoney += 1000; //판매자2에게 1000원을 지불하고
//		seller2.numOfApple -= 70; //사과 70개를 구매했다.
//		buyer.numOfApple += 70; //하지만 구매자의 보유금액은 차감되지 않았다.
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();			
		
	}
}


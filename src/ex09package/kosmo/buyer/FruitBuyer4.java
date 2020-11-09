package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller4;

//구매자를 표현한 클래스
public class FruitBuyer4{

	int myMoney ; //보유금액  
	int numOfApple ; //구매한 사과의 갯수

	public FruitBuyer4(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}
package ex05method;
/*
문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 
반환하는 메소드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 
main메소드를 정의하자.

메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.
 */
public class QuFindPrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		
		if(num==1) {
			//1은 소수가 아니므로 무조건 false반환
			return false;
		}
		else {
			/*
			모든 자연수는 1과 자신으로 나눠지므로 두 조건을 제외한 
			나머지 수로 나눠서 떨어지는지 판단한다. 
			 */
			for(int i=2 ; i<=num-1 ; i++) {
				/*
				1과 자신을 제외한 숫자로 나눠서 떨어지면 소수가 아니므로
				그 이후는 검사할 필요가 없다. 판단되는 즉시 fasle를
				반환하고 함수를 종료한다. 
				 */
				if(num%i==0)
					return false;
			}
			//위 조건을 통과하게되면 소수이므로 true반환
			return true;	
		}		
	}

	public static void main(String[] args) {
		//1~100사이의 정수를 소수인지 판단한다.
		for(int i=1 ; i<=100 ; i++) {
			//만약 해당 숫자 i가 소수라면 콘솔에 출력한다.
			if(isPrimeNumber(i)==true) {
				System.out.println("소수:"+ i);
			}
		}		
	}
}

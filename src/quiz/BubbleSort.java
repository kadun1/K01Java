package quiz;

/*
중복되지 않는 난수 10개(1~99)를 생성하여 크기가 10인 배열에 담는다.
오름차순으로 버블정렬한다.(1, 2, 3 …… 10)
단, 정렬되는 과정을 모두 출력해야 한다.
 */

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		Random random = new Random();
		//int randNum = random.nextInt(100);
		int [] bubNum = new int[10];
		for(int i=0; i<bubNum.length; i++) {
			bubNum[i]=random.nextInt(100);
			for(int j=0; j<i; j++) {
				if(bubNum[i]==bubNum[j]) {
					i--;
				}
			}
		}
		for(int i=0; i<bubNum.length; i++) {
			for(int j=0; j<bubNum.length; j++) {
				if(bubNum[i]>bubNum[j]) {
					int temp;
					temp=bubNum[j];
					bubNum[j]=bubNum[i];
					bubNum[i]=temp;
				}
				
			}
		}
		for(int i=0; i<bubNum.length; i++) {
			System.out.print(bubNum[i]+" ");
		}
	}

}

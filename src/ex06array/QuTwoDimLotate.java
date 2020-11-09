package ex06array;
/*
즉 메소드를 호출하면 1행은 2행으로, 2행은 3행으로 마지막행은 1행으로 이동하게된다.
단 세로길이에 상관없이 동작하도록 메소드를 정의해야 한다.
 */
public class QuTwoDimLotate {

	//2차원배열을 출력하기위한 메소드
	static void arrPrint(int[][] arr) {
		//세로 크기만큼 반복
		for(int i=0 ; i<arr.length ; i++) {
			//가로 크기만큼 반복
			for(int j=0 ; j<arr[i].length ; j++) {
				//각각의 요소를 출력함
				System.out.print(arr[i][j]+" ");
			}				
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		//3by3 배열 생성
		int[][] arr = new int[3][3];
		/*
		int[][] arr = {1,2,3 ...... ,8,9};
		 */
		
		//배열 초기화 위한 변수
		int initVal = 1;
		/*
		2차원배열에서
			배열의이름.length => 세로길이 반환
			배열의이름[세로인덱스].length => 해당 가로행의 길이반환
		 */
		for(int i=0; i<arr.length; i++){			
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = initVal++;				
			}
		}
		
		//초기화 직후 출력
		arrPrint(arr);
		
		//한행씩 이동하기
		rotateArray(arr);
		arrPrint(arr);//출력
		
		//한행씩 이동하기
		rotateArray(arr);
		arrPrint(arr);//출력
		
		//한행씩 이동하기
		rotateArray(arr);
		arrPrint(arr);//출력		
	}

	public static void rotateArray(int[][] arrParam) {
		
		/*
		절차
			1.배열의 마지막행을 1차원배열 변수에 임시로 저장
			2.배열의 2행을 3행으로, 1행을 2행으로 옮긴다.
			3.1번에서 임시로 저장했던 값을 1행으로 옮긴다.
			
			※2차원배열에서 "배열이름[인덱스]"가 하나의 행(세로행)을
			가리킨다는것을 활용하는 문제임.
		 */
		//절차1
		int[] lastRow = arrParam[arrParam.length-1];
		//절차2 : 세로크기에 상관없이 동작해야 하므로 length를 사용한다. 
		for(int row=arrParam.length-1 ; row>0 ; row--) {
			arrParam[row] = arrParam[row-1];
		}
		//절차3
		arrParam[0] = lastRow;
	}
}












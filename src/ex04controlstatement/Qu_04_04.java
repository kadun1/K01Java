package ex04controlstatement;
/*
public static void main(String[] args)
{
	 int num = 120;
	 if (num > 0) {
		if ((num % 2) == 0) {
			System.out.println("양수이면서 짝수");
		}
	 }
}
 */
public class Qu_04_04 {

	public static void main(String[] args) {
		
		int num = 120;
		if (num > 0 && (num % 2)==0) {
			System.out.println("양수이면서 짝수");
		}
	}
}

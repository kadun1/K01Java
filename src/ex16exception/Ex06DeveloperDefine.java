package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
사용자정의 예외클래스
1. Exception 클래스를 상속받는다.
2. 생성자에서 예외발생시 출력할 메세지를 super()를 통해 입력한다.
3. 예외 발생지점에서 if문으로 감지한후 예외객체를 생성 및 throw 한다. 
4. catch문에서 예외객체를 받아 처리한다.  
 */
class AgeErrorException extends Exception {
	public AgeErrorException() {
		super("나이 입력이 개잘못 되었어요");
	}
}

public class Ex06DeveloperDefine {

	public static void main(String[] args) {

		System.out.print("나이를 입력하세요 : ");

		try {
			int age = readAge();
			System.out.println("당신의 나이는 "+ age +" 입니다.");
		}
		catch(AgeErrorException e) {
			System.out.println("[예외발생]"+ e.getMessage());
		}
	}

	public static int readAge() throws AgeErrorException {
		Scanner sc = new Scanner(System.in);
		int inputAge=0;
		try {
			//나이 입력시 마이너스값을 입력하면 예외가 발생한다.
			inputAge = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		//개발자가 예외를 감지하여...
		if(inputAge<0) {
			//예외객체를 생성한 후 프로그램으로 throw 한다.
			AgeErrorException ex = new AgeErrorException();
			throw ex;
		}
		return inputAge;
	}
}

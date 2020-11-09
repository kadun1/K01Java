package ex21jdbc.prepared;

import java.sql.Date;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class InsertSQL extends IConnectImpl{

	public InsertSQL() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	
	@Override
	public void execute() {

		try {
			//1. 쿼리문준비 : 값을 세팅이 필요한 부분을 ?(인파라미터)로 대체한다.
			String query = "INSERT INTO member VALUES (?, ?, ?, ?)";
			
			//2.prepared객체생성 : 생성시 준비한 쿼리문을 인자로 전달한다.
			psmt = con.prepareStatement(query);
			
			//3.DB에 입력할 값을 사용자로부터 입력받음.
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디:");
			String id = scan.nextLine();
			System.out.print("패스워드:");
			String pw = scan.nextLine();
			System.out.print("이름:");
			String name = scan.nextLine();
			
			//4.인파라미터 설정 : ?의 순서대로 설정하고 DB이므로 인덱스는 1부터 시작
			/*
				인파라미터 설정시 사용하는 메소드
				자료형이
					숫자면 setInt(0
					문자면 setString()
					날짜면 setDate() 를 사용한다.
				해당 setXXX()메소드를 사용하면 '(싱글쿼테이션)은 자동으로 삽입된다.
			 */
			psmt.setNString(1, id);
			psmt.setNString(2, pw);
			psmt.setNString(3, name);
			//날짜를 문자열로 입력하는 경우
			//psmt.setNString(4, "2018-11-20");
			
			//날짜를 date타입으로 입력하는경우
			/*
				현재날짜를 java단에서 입력하는 경우 아래와 같은 변환과정을 거쳐야한다.
				util패키지로 시간을 가져온후 sql패키지로 타입을 변환한다.
				이때는 date형으로 입력되기 때문에 setDate()로 인파라미터를 설정한다.
			 */
			java.util.Date utilDate = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			psmt.setDate(4, sqlDate);
			
			//5.쿼리실행을 위해 prepared객체를 실행한다.
			int affected = psmt.executeUpdate();
			System.out.println(affected+"행이 입력되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new InsertSQL().execute();
	}
}

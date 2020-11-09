package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {

	private Connection con;
	private Statement stmt;
	
	//생성자에서는 드라이버에 대한 로드만 진행한다.
	public DeleteQuery() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	//Oracle DB에 대한 연결을 진행한다.
	public void connect() {
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin://@localhost:1521:orcl",
							"kosmo", "1234");
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}
	
	//DB연결, 쿼리작성, 쿼리 전송 및 실행을 위한 메소드
	private void execute() {
		
		//여기서 DB연결
		connect();
		
		try {
			/*
			test99 삭제시 입력되지 않은 데이터이므로 삭제되지 않음.
			데이터가 없는경우 예외는 발생하지 않음.
			ko1 삭제시 자식레코드가 있으므로 제약조건위배로 삭제되지 않음.
			*/
			stmt = con.createStatement();
			String query = "DELETE FROM member WHERE id='ko1'";
			int affected = stmt.executeUpdate(query);
			
			System.out.println(affected +"행이 삭제됨");
		}
		catch(SQLException e) {
			System.out.println("쿼리실행 오류");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	private void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류 발생");
		}
	}
	
	public static void main(String[] args) {

		new DeleteQuery().execute();
		
	}

}

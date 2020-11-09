package ex21jdbc.statement;

import java.sql.SQLException;

public class UpdateQuery extends ConnectDB{

	//생성자
	public UpdateQuery(String user, String pass) {
		//부모클래스의 인자생성자를 호출
		super(user, pass);
	}
	
	@Override
	void execute() {
		try {
			stmt = con.createStatement();
			
			String sql = "UPDATE member "
					+ " SET "
					+ " pass='8888', "
					+ " name='testUpdate', "
					+ " regidate=sysdate "
					+ " WHERE id='test3' ";
			//디버깅을 위한 쿼리문 출력
			System.out.println("sql="+ sql);
			
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected +"행이 업데이트 됨");
		}
		catch(SQLException e) {
			System.out.println("쿼리오류");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알수없는 예외발생");
			e.printStackTrace();
		}
		finally {
			close();//부모클래스의 멤버메소드를 호출
		}
	}
	
	public static void main(String[] args) {
		new UpdateQuery("kosmo", "1234").execute();
	}
}

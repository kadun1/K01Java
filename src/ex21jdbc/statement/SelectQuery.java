package ex21jdbc.statement;

import java.sql.SQLException;

public class SelectQuery extends ConnectDB {
	
	public SelectQuery() {
		super();
	}

/*
ResultSet클래스
	: select문 실행시 쿼리의 실행결과가 resultSet객체에 저장된다.
	결과로 반환된 레코드의 처음부터 마지막까지 next()메소드를 통해
	확인후 반복하면서 추출하게 된다.
	-getXXX()계열의 메소드
	오라클의 자료형이
		number타입 : getInt()
		char/varchar2타입 : getString()
			=> 오라클 자료형에 상관없이 모든 타입을 추출할 수 있다.
		date타입 : getDate()
		메소드로 각 컬럼의 데이터를 추출한다.
	-인자는 select절의 컬럼순서대로 인덱스(1부터시작)를 사용하거나
	컬럼명을 사용할 수 있다.
 */
	@Override
	void execute() {
		try {
			stmt = con.createStatement();
			
			String query = "SELECT id, pass, name, regidate,"
					+ " to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 "
					+ " from member";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String id = rs.getNString(1);//id컬럼
				String pw = rs.getNString("pass");
				String name = rs.getString("name");
				/*
				오라클의 date타입을 getDate()로 추출하면 0000-00-00
				형태로 출력된다. 이경우 date형 자료가 되기때문에
				java.sql.Date클래스의 참조변수로 저장해야한다.
				 */
				java.sql.Date regidate = rs.getDate("regidate");
				
				/*
				오라클의 date타입을 getString()으로 추출하면
				0000-00-00 00:00:00형태로 시간까지 출력할수 있다.
				만약 문자열을 잘라서 출력하고 싶다면 substring()을 사용한다.
				 */
				String regidate2 =rs.getNString("regidate");
				String regidate3 =rs.getNString("regidate").substring(0, 13);
				String regidate4 = rs.getNString("d1");//별칭을 그대로 사용
				
				System.out.printf("%s %s %s %s %s %s %s\n", id, pw, name, regidate, regidate2, regidate3, regidate4);
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();//DB 자원반납
		}
	}
	
	public static void main(String[] args) {
		SelectQuery selectSQL = new SelectQuery();
		selectSQL.execute();
	}
}

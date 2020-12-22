package ex21jdbc.shopping;

import java.sql.SQLException;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl{

	public SelectShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색어를 입력하세요");
		String searchName = scanner.nextLine();
		
		try {
			
			String sql = "SELECT g_idx, goods_name, "
					+ " trim(to_char(goods_price, '999,999,000')), "
					+ " to_char(regidate, 'yyyy-mm-dd hh:mi'),"
					+ " p_code "
					+ " FROM sh_goods "
					+ " WHERE goods_name like'%"+searchName+"%'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int idx = rs.getInt(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				/*
				오라클의 date타입을 getString()으로 추출하면
				0000-00-00 00:00:00형태로 시간까지 출력할수 있다.
				만약 문자열을 잘라서 출력하고 싶다면 substring()을 사용한다.
				 */
				String regidate = rs.getString(4);
				String code = rs.getString(5);
				
				System.out.printf("일련번호:%d, 상품명:%s,가격:%s, 등록일:%s, 제품코드:%s \n", idx, name, price, regidate, code);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		
	}
	public static void main(String[] args) {
		new SelectShop().execute();
	}
}

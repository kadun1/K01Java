package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{

	public InsertShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		
		int affected = 0;
		
		try {
			
			String sql = " INSERT INTO sh_goods "
					+ " VALUES (goods_seq.nextval, ?, ?, sysdate, ?) "; 
			
			psmt = con.prepareStatement(sql);
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("가격"));
			psmt.setString(3, scanValue("상품코드"));
			affected = psmt.executeUpdate();
			
			System.out.println("입력된 행의 갯수:"+affected);
				
			}
		catch(Exception e) {
			System.out.println("Insert중 예외발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		
		new InsertShop().execute();
	}

}

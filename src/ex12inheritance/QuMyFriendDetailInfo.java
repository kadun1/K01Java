package ex12inheritance;

//친구의 정보를 저장할 기본클래스
class MyFriendInfo
{
	private String name;
	int age;
		
	public MyFriendInfo(String _name, int _age) {
		name = _name;
		age = _age;
	}
	
	public void showMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
  	private String phone;
  	
  	public MyFriendDetailInfo(String _name, int _age, 
  			String _addr, String _phone) {
		super(_name, _age);
		addr = _addr;
		phone = _phone;
	}

	public void showMyFriendDetailInfo()
	{
		/*
		부모클래스의 멤버메소드를 호출할때 명시적으로 super를 
		사용하는것이 좋다. 
		 */
		super.showMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfo
{
	public static void main(String[] args)
	{
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		MyFriendDetailInfo info = 
				new MyFriendDetailInfo("이순신", 100, "성균관", "010-1000-8888");
		//정보Print
		info.showMyFriendDetailInfo();
	}
}


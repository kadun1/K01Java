package ex13interface;

/*
추상클래스를 interface로 변경하기
	abstract class -> interface
	
	메소드의 경우 public abstract를 제거
	
	멤버상수인 경우 public static final을 제거한다. 
 */

//프로젝트 전체에서 기준이 될수있는 추상클래스 정의
interface PersonalNumberStorageInter {
	void addPersonalInfo(String juminNum, String name);
	String searchPersonalInfo(String juminNum);
}

/*
한 사람의 정보를 저장하기 위한 DTO클래스. 혹은 VO(Value Object)라고도 한다.
 */
class PersonalInfoVO {
	//멤버변수 - private으로 선언
	private String name;
	private String juminNum;
	public PersonalInfoVO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	//private멤버를 반환하는 용도의 getter() 메소드
	String getName() { return name; }
	String getJuminNum() { return juminNum; }
}

/*
클래스가 클래스를 상속할때 => extends 
클래스가 인터페이스를 상속할때 => implements
인터페이스가 인터페이스를 상속할때 => extends 를 사용한다. 

extends는 '상속'이라 표현하고, implements는 '구현'이라 표현한다.
 */
class PersonalNumberStorageImpl implements PersonalNumberStorageInter {	
	
	//멤버변수
	PersonalInfoVO[] personalArr; //정보저장용 객체배열 
	int numOfPerInfo; //입력정보 카운트용 변수
	//생성자
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;
	}
	/*
	상속을 통해 추상메소드를 포함하게 되었으므로 반드시 아래와같이
	오버라이딩 해야한다.(필수)
	 */
	/*
	전달받은 인자를 통해 DTO객체를 생성한 후 객체배열에 추가함.
	 */
	@Override
	public void addPersonalInfo(String juminNum, String name) {		
		personalArr[numOfPerInfo] = 
				new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}
	/*
	주민번호를 인자로 전달받아 객체배열에 저장된 정보를 검색한 후
	일치하는 경우에만 이름을 반환한다. 
	 */
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0 ; i<numOfPerInfo ; i++) {
			//멤버변수가 private이므로 getter를 통해 반환받음.
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0)
			{
				return personalArr[i].getName();
			}
		}
		//검색결과가 없을때는 null 반환함.
		return null; 
	}
}

public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		//객체 생성
		PersonalNumberStorageImpl storage = 
			new PersonalNumberStorageImpl(10);
		//정보 추가
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		//검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}
}
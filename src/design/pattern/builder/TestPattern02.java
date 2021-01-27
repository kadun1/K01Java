package design.pattern.builder;

/*
빌더패턴
	: 객체의 생성과정에서 표현방법과 생성과정을 분리하여
	동일한 생성절차에서 다른 표현결과를 만들수 있게하는
	디자인 패턴. 멤버변수의 갯수가 많을때 사용하면 편리하다.
	
절차
	1. Person클래스 생성 - 맴버변수, getter, setter
	2. PersonBuilder클래스 생성 - Person과 동일한 맴버변수
								및 setter 생성
	3. setter를 아래와같이 수정
		반환형 void -> PersonBuilder
		메소드명 setXXX -> set을 삭제하고 멤버변수명과 동일하게..
		return this를 각 메소드에 추가
	4. PersonBuilder 클래스 마지막에 build()메소드 생성
		setter를 통해 각 멤버변수 초기화 한 후 Person객체를 반환
	5. Person클래스의 마지막에 PersonBuilder를 반환하는 builder() 생성
	
이와같이 하면 객체생성시 메소드체인 형태로 각 멤버변수를 마음대로 설정할 수 있다.
 */
public class TestPattern02 {

	public static void main(String[] args) {

		//1번객체 : 이름, 주소
		Person p1 = Person.builder()
				.firstName("전")
				.lastName("우치")
				.addr1("가산디지털")
				.addr2("월드메르디앙")
				.build();
		
		//2번객체 : 이름, 운전면허, 결혼유무
		Person p2 = Person.builder()
				.firstName("홍")
				.lastName("길동")
				.driverLicence(true)
				.married(false)
				.build();
	}

}

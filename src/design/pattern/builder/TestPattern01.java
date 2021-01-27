package design.pattern.builder;

public class TestPattern01 {

	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName("홍");
		person.setLastName("길동");
		person.setAddr1("가산디지털단지");
		
		System.out.println(person.getFirstName());
		System.out.println(person.getAddr1());
		
		/*
		 클래스를 구성하는 맴버변수의 갯수가 많아지게 되면 생성자나 setter()를
		 통해 초기화 하는것이 어려워진다. 또한 개발자가 원하는 맴버변수만 선별해서
		 초기화 하는것 역시 번거롭다.
		 */
		//생성자를 통한 초기화는 모든 형태를 만들어 놓아야 한다.
		//Person person2 = new Person(firstName, lastName, addr1, addr2, gender, driverLicence, married)
	}

}

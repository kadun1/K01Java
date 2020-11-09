package common;

public class Person {
	public String name;
	public int age;
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//객체의 정보 반환용 메소드
	public String getInfo() {
		return String.format("이름:%s, 나이:%d", name, age);
	}
	//객체의 정보 출력용 메소드
	public void showInfo() {
		System.out.println(getInfo());		
	}
	
	
	/*
	Set컬렉션에서 객체 저장시 동일한 객체인지 확인하기위해
	아래 2개의 메소드를 자동으로 호출하여 확인한다.
	따라서 개발자가 정의한 객체인 경우 중복제거를 위해 반드시
	오버라이딩 해야 한다. 
	 */
	@Override
	public int hashCode() {		
		//return (name.hashCode()+age) % 3; //둘다비교 
		//return name.hashCode() % 3; //이름만비교
		return age % 3; //나이만비교
	}
	@Override
	public boolean equals(Object obj) {
		Person comparePerson = (Person)obj;
		System.out.println("오버라이딩한 equals()메소드 호출됨");
		
		//if(comparePerson.age==this.age && comparePerson.name.equals(this.name) ) {
		//if(comparePerson.name.equals(this.name) ) {
		if(comparePerson.age==this.age) {
			return true;
		}
		else {
			return false;
		}			
	} 
}









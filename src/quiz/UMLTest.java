package quiz;

interface IPerson {
	void talk();
	void walk();
	void eat();
}

class Person implements IPerson {
	private String name;
	private int age;
	private String height;
	public String weight;
	
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}

class Teacher extends Person {
	
	public String subject;
	public void teaching() {
		
	}
}

public class UMLTest {

}

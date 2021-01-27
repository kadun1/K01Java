package design.pattern.builder;

public class PersonBuilder {

	private String firstName;
	private String lastName;
	private String addr1;
	private String addr2;
	private String gender;
	private boolean driverLicence;
	private boolean married;
	
	public PersonBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public PersonBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public PersonBuilder addr1(String addr1) {
		this.addr1 = addr1;
		return this;
	}
	public PersonBuilder addr2(String addr2) {
		this.addr2 = addr2;
		return this;
	}
	public PersonBuilder gender(String gender) {
		this.gender = gender;
		return this;
	}
	public PersonBuilder driverLicence(boolean driverLicence) {
		this.driverLicence = driverLicence;
		return this;
	}
	public PersonBuilder married(boolean married) {
		this.married = married;
		return this;
	}
	
	public Person build() {
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddr1(addr1);
		person.setAddr2(addr2);
		person.setGender(gender);
		person.setDriverLicence(driverLicence);
		person.setMarried(married);
		return person;
	}
}

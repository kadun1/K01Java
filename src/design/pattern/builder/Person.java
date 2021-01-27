package design.pattern.builder;

public class Person {
	
	private String firstName;
	private String lastName;
	private String addr1;
	private String addr2;
	private String gender;
	private boolean driverLicence;
	private boolean married;
	
	public Person() {}
	public Person(String firstName, String lastName, String addr1, String addr2, String gender, boolean driverLicence,
			boolean married) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.gender = gender;
		this.driverLicence = driverLicence;
		this.married = married;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isDriverLicence() {
		return driverLicence;
	}
	public void setDriverLicence(boolean driverLicence) {
		this.driverLicence = driverLicence;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
}

package ex08class;

public class TestAutoClass {
	
	String carName;
	int carYear;
	String owner;
	
	public TestAutoClass(String carName, int carYear, String owner) {
		super();
		this.carName = carName;
		this.carYear = carYear;
		this.owner = owner;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
}

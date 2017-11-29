package car;

import employee.Employee;

public class Driver {
	private Employee driver;
	

	public Driver(Employee driver) {
	this.setDriver(driver);
		}

// Employee emp = new Employee();
//	public Driver(Employee driver) {
//		if (emp.getHasDrivingLicense() == true) {
//			this.setDriver(driver);
//		} else {
//			System.out.println("Employee does not have the driving license");
//		}
//	}
	// gdzie dodac warunek - jezeli employee.hasDrivingLicense=true, to moge
	// dodac do konstruktora
	public Employee getDriver() {
		return driver;
	}

	public void setDriver(Employee driver) {
		this.driver = driver;
		// w main trzeba obsluzyc ten wyjatek
	}

	@Override
	public String toString() {
		return null;// "Driver [driver=" + driver.toString() + "]";
	}
}

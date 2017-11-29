package employee;

import services.ServiceMethods;

public class Employee {

	private String name;

	private String surname;
	private double salary;
	private boolean hasDrivingLicense;
	private static int employeeInterator = 0;
	private int uniqueID;

	public static ServiceMethods displ = new ServiceMethods();

	public Employee() {
	}

	public Employee(String name, String surname, double salary, boolean hasDrivingLicense) {
		this.name = name;
		this.surname = surname;
		this.hasDrivingLicense = hasDrivingLicense;
		this.salary = salary;
		employeeInterator++;
		this.uniqueID = employeeInterator;
		ServiceMethods.addEmployeeToList(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean getHasDrivingLicense() {
		return hasDrivingLicense;
	}

	public void setHasDrivingLicense(boolean hasDrivingLicense) {
		this.hasDrivingLicense = hasDrivingLicense;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}

	public String toString() {
		return "Employee ID:" + uniqueID + "; Imie: " + name.substring(0, 1).toUpperCase() + name.substring(1)
				+ "; Nazwisko: " + surname.substring(0, 1).toUpperCase() + surname.substring(1)+ "; Driving license: " + hasDrivingLicense;
	}

}
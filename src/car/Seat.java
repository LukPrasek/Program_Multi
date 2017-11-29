package car;

import employee.Employee;

public class Seat {

	private Employee passanger;

	public Seat(Employee employee) {
		this.passanger=employee;
	}

	public Employee getPassanger() {
		return passanger;
	}

	public void setPassanger(Employee passanger) {
		this.passanger = passanger;
	}

	@Override
	public String toString() {
		return "Seat [passanger=" + passanger.toString() + "]";
	}
	
	

}

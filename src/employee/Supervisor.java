package employee;

public class Supervisor extends Employee {
	private int extraHours = 0;

	public Supervisor(String name, String surname, double salary, boolean hasDrivingLicense, int extraHours) {
		super(name, surname, salary, hasDrivingLicense);
		this.setExtraHours(extraHours);
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}

}

package services;

import employee.Employee;
import employee.Supervisor;

public class AddEmployee {

	
	public static Employee createEmployee(String name, String surname, double salary, boolean hasDrivingLicense) {
		Employee emp1=new Employee(name,surname, salary, hasDrivingLicense);
		return emp1 ;
	}
	public static Supervisor createSupervisor(String name, String surname, double salary, boolean hasDrivingLicense, int extraHours) {
		Supervisor sup1=new Supervisor(name,surname, salary, hasDrivingLicense,extraHours);
		return sup1 ;
	}
}

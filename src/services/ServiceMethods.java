package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


import car.Car;
import employee.Employee;

public class ServiceMethods {// all employments


	public static List<Employee> employees = new ArrayList<>();//to tez jest zmienna
	public static List<Car> cars = new ArrayList<>();
	public static Set<Employee> employeeSet= new HashSet<>();


	public static void showEmployees() {
		for (Employee empl : employees) {
			System.out.println(empl.toString());//
		}
	}
	public static Employee findEmployeeByID(int employeeId) {
		for (Employee empl : employees) {
			if (employeeId == empl.getUniqueID()) {
				return empl;
			}
		}
		return null;//
	}


public static void addEmployeeToEmployeeSet (Employee emp) {
		employeeSet.add(emp);
			}

	public static void addEmployeeToList(Employee employee) {
		employees.add(employee);
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public static void showCars() {
		for (Car car : cars) {
			System.out.println(car.toString());
		}
	}

	public static void addCarToList(Car car) {
		cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}
	public static Car findCarByID(int carId){
		for  (Car car : cars){
			if (carId==car.getUniqueCarID()) {
				return car;
			}
		}
		return null;
}

	public static Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public static void setEmployeeSet(Set<Employee> employeeSet1) {
		employeeSet = employeeSet1;
	}
}
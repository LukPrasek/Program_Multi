package services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import employee.Employee;
import field.Field;

public class ServiceForField {
	boolean isCorrectData = false;
	private static List<Field> fields = new ArrayList<>();
	private static List<Employee> fieldEmployees = new ArrayList<>();

	public static void addFieldToList(Field field) {
		fields.add(field);
	}

	public static List<Employee> getFieldEmployees() {
		return fieldEmployees;
	}

	public void setFieldEmployees(List<Employee> fieldEmployees) {
		this.fieldEmployees = fieldEmployees;
	}

	public void showAllFields() {
		for (Field f : fields) {
			System.out.println(f.toString());
		}
	}
	public void showAllFieldEmployees() {
		for (Employee fd : fieldEmployees) { 
			System.out.println(fd.toString());
		}
	}

	public void assignEmployeeToField(int fieldID, int employeeID) {
		fieldChecker(fieldID);
		if (isCorrectData = true) {
			employeeChecker(employeeID);
			getFieldEmployees().toString();
			System.out.println("Field: ["+fields.get(fieldID-1)+"] includes following employee(s) ["+fieldEmployees.get(0)+"]");
		}
	}

	public void fieldChecker(int field) {
		for (Field f : fields) {
			if (field == f.getFieldID()) {
				isCorrectData = true;
			}
		}
	}

	public void employeeChecker(int employeeID) {
		for (Employee empl : ServiceMethods.employees) {
			if (employeeID == empl.getUniqueID()) {
				//System.out.println(employeeID);
				//System.out.println(empl.getUniqueID());
				isCorrectData = true;
				fieldEmployees.add(empl);

			}
		}//close if
		//return null;
	}//close for
	
	public static Date dateFormatterFromString(String startDateString) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date startDate = null;
		try {
			// Parsing the String
			startDate = dateFormat.parse(startDateString);
			//System.out.println(startDate);
			String newStartDateString = dateFormat.format(startDate);
			//System.out.println(newStartDateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return startDate;
	}
	
	
}
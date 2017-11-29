package employee;

import services.ServiceMethods;

public class EmployeeObjectsStorage {
	// AddEmployee empl1a= new AddEmployee();
Employee[] table=new Employee[12];
	public EmployeeObjectsStorage() {
		table[0] = AddEmployee.createSupervisor("Karol", "Wojtyla", 64218, true,35);
		table[1] = AddEmployee.createEmployee("Jacek", "Nowak", 7654, true);
		table[2] = AddEmployee.createEmployee("Krzysztof", "Rus", 23456, false);
		table[3] = AddEmployee.createEmployee("Mieszko", "Malinowski", 47913, true);
		table[4] = AddEmployee.createEmployee("Michal", "Mak", 4363, true);
		table[5] = AddEmployee.createEmployee("Robert", "Borys", 123098, false);
		table[6] = AddEmployee.createEmployee("Krzysztof", "Piasek", 9631, true);
		table[7] = AddEmployee.createEmployee("Micha³", "Celej", 6732, false);
		table[8] = AddEmployee.createEmployee("Karol", "Karocki", 4629, true);
		table[9] = AddEmployee.createEmployee("Grzegorz", "Goral", 5678, true);
		table[10] = AddEmployee.createEmployee("Kazimierz", "Marcinkiewicz", 123098, true);
		table[11] = AddEmployee.createEmployee("Zbigniew", "Konopka", 8564, true);

		
//		for (Employee emp: table) {// uzylem metody add to list w konstruktorze!!
//				ShowAll.addEmployeeToList(emp);
//	}
}
}

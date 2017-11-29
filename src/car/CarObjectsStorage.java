package car;

import employee.AddEmployee;
import employee.Employee;
import services.AddCar;
import services.ServiceMethods;

public class CarObjectsStorage {
	Car[] table=new Car[5];
	public CarObjectsStorage() {
		table[0] = AddCar.CarWithThreeSeats("Mercedes",  "WW1234567", "2017", new Driver(ServiceMethods.findEmployeeByID(1)), new Seat(ServiceMethods.findEmployeeByID(2)), new Seat(ServiceMethods.findEmployeeByID(3)));
		table[1] = AddCar.CarWithThreeSeats("Vokswagen",  "WR7654310", "2013", new Driver(ServiceMethods.findEmployeeByID(4)), new Seat(ServiceMethods.findEmployeeByID(8)), new Seat(ServiceMethods.findEmployeeByID(12)));;
		table[2] = AddCar.CarWithThreeSeats("Mercedes",  "WB0987632", "2015", new Driver(ServiceMethods.findEmployeeByID(5)), new Seat(ServiceMethods.findEmployeeByID(9)), new Seat(ServiceMethods.findEmployeeByID(1)));;
		table[3] = AddCar.CarWithThreeSeats("Vokswagen",  "WRA3263136", "2016", new Driver(ServiceMethods.findEmployeeByID(6)), new Seat(ServiceMethods.findEmployeeByID(10)), new Seat(ServiceMethods.findEmployeeByID(2)));;
		table[4] = AddCar.CarWithThreeSeats("Vokswagen",  "WX7654333", "2014", new Driver(ServiceMethods.findEmployeeByID(7)), new Seat(ServiceMethods.findEmployeeByID(11)), new Seat(ServiceMethods.findEmployeeByID(3)));;
		
	}
}

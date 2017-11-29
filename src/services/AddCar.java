package services;

import car.Car;
import car.CarWithThreeSeats;
import car.CarWithSixSeats;
import car.Driver;
import car.Seat;
import employee.Employee;

//import java.text.ParseException;

public class AddCar {

	public static Car CarWithThreeSeats(String brand, String regNumber, String prodYear, Driver driver, Seat seat1, Seat

	seat2) {
		Car carThree = new CarWithThreeSeats(brand, regNumber, prodYear, driver, seat1, seat2);
		return carThree;
	}

	public static Car CarWithSixSeats(String brand, String regNumber, String prodYear, Driver driver, Seat seat2,
			Seat seat3 ) {//,Seat seat4, Seat seat5, Seat seat6
		Car carSixSeats = new CarWithSixSeats(brand, regNumber, prodYear, driver, seat2, seat3);//, seat4, seat5, seat6
		return carSixSeats;
	}

}

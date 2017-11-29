package car;

//import java.util.Calendar;
//import java.util.Date;

import services.ServiceMethods;

//import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Car { //implements Serializable
	private String brand;
	private String regNumber;
	private String prodYear;
	private Driver driver;
	private static int carInterator = 0;
	private int uniqueCarID;
	// private int seats=6; - gdzie metoda setDriver???
	// max 5 pasazerow+kierowca
	static SimpleDateFormat formatter;

	public Car(String brand, String regNumber, String prodYear, Driver driver) {
		this.brand = brand;
		this.regNumber = regNumber;
		this.prodYear = prodYear;
		this.driver=driver;
		setUniqueCarID(getUniqueCarID() + 1);
		ServiceMethods.addCarToList(this);
	}

	public void setProdYear(String prodYear) {
		this.prodYear = prodYear;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	//
	// public Date getProdYear() throws ParseException {
	// SimpleDateFormat sdf = new SimpleDateFormat("MM-yyyy");
	// Date date = sdf.parse(prodYear);
	// return date;
	// }

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String toString() {
		return "Driver: " + driver.toString() + "Brand: " + brand + ", Registration number: " + regNumber
				+ ", Production year: " + prodYear;
	}

	public static int getCarInterator() {
		return carInterator;
	}

	public static void setCarInterator(int carInterator) {
		Car.carInterator = carInterator;
	}

	public int getUniqueCarID() {
		return uniqueCarID;
	}

	public void setUniqueCarID(int uniqueCarID) {
		this.uniqueCarID = uniqueCarID;
	}
}

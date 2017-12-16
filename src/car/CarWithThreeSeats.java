package car;

public class CarWithThreeSeats extends Car {

	private Seat nextToDriver;
	private Seat nextToPassanger;

	public CarWithThreeSeats(String brand, String regNumber, String prodYear, Driver driver, Seat seat1, Seat seat2) {
		super(brand, regNumber, prodYear, driver);
		this.nextToDriver = seat1;
		this.nextToPassanger = seat2;
		// TODO Auto-generated constructor stub
	}

	public Seat getNextToDriver() {
		return nextToDriver;
	}

	public void setNextToDriver(Seat nextToDriver) {
		this.nextToDriver = nextToDriver;
	}

	@Override
	public String toString() {
		return "Car With Three Seats [First seat next To Driver: " + nextToDriver.getPassanger() +

				"Second seat next To Passenger= "+ nextToPassanger.getPassanger()+"]";
				//+ "Car parts:" + super.toString() + "
	}

}
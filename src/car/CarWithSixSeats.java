package car;

public class CarWithSixSeats extends Car {
	private Seat seatNextToDriver=null;
	private Seat seatNextToPassanger=null;
	private Seat seatRearBehindDriver=null;
	private Seat seatRearMiddle=null;
	private Seat seatRearBehindPassanger=null;

	public CarWithSixSeats(String brand, String regNumber, String prodYear, Driver driver, Seat seatNextToDriver,
			Seat seatNextToPassanger) {//, Seat seatRearBehindDriver, Seat seatRearMiddle, Seat seatRearBehindPassanger
		super(brand, regNumber, prodYear, driver);
		// TODO Auto-generated constructor stub
		this.seatNextToDriver = seatNextToDriver;
		this.seatNextToPassanger = seatNextToPassanger;
		//Zawsze kierowca i dwoch pasazerow, pozostale siedzenie trzeba obsadzic przez settery
//		this.seatRearBehindDriver = seatRearBehindDriver;
//		this.seatRearMiddle = seatRearMiddle;
//		this.seatRearBehindPassanger = seatRearBehindPassanger;
	}
	public Seat getSeatNextToDriver() {
		return seatNextToDriver;
	}

	public void setSeatNextToDriver(Seat seatNextToDriver) {
		this.seatNextToDriver = seatNextToDriver;
	}

	public Seat getSeatNextToPassanger() {
		return seatNextToPassanger;
	}

	public void setSeatNextToPassanger(Seat seatNextToPassanger) {
		this.seatNextToPassanger = seatNextToPassanger;
	}

	public Seat getSeatRearBehindDriver() {
		return seatRearBehindDriver;
	}

	public void setSeatRearBehindDriver(Seat seatRearBehindDriver) {
		this.seatRearBehindDriver = seatRearBehindDriver;
	}

	public Seat getSeatRearMiddle() {
		return seatRearMiddle;
	}

	public void setSeatRearMiddle(Seat seatRearMiddle) {
		this.seatRearMiddle = seatRearMiddle;
	}

	public Seat getSeatRearBehindPassanger() {
		return seatRearBehindPassanger;
	}

	public void setSeatRearBehindPassanger(Seat seatRearBehindPassanger) {
		this.seatRearBehindPassanger = seatRearBehindPassanger;
	}

}
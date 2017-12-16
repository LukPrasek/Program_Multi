

import java.util.InputMismatchException;
import java.util.Scanner;

import services.AddCar;
import services.AddField;
import services.ServiceForField;
import car.CarObjectsStorage;
import car.Driver;
import car.Seat;
import employee.Employee;
import employee.EmployeeObjectsStorage;
import exception.IncorrectUserInterfaceDataException;
import exception.IncorrectUserInterfaceDataException.ExceptionName;
import field.FieldObjectsStorage;
import employee.AddEmployee;
import services.ServiceMethods;

public class Main {

	static boolean isCorrectCarData = false;		// dodane zeby dzialalo caly czas

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		EmployeeObjectsStorage emplStorage = new EmployeeObjectsStorage();
		CarObjectsStorage cos=new CarObjectsStorage();
		FieldObjectsStorage newFields=new FieldObjectsStorage();

		userInterface(isCorrectCarData);
	}

	private static void userInterface(boolean isCorrectCarData) {
		Scanner scanner = new Scanner(System.in);
		ServiceForField sff= new ServiceForField();
		printEmployeeOption();// opcje do wyboru
		try {

			int x = getCarSizeFromUser(scanner);// RETURN vARVARIABLE- 3 ALBO 6,
			Scanner scanner4=new Scanner(System.in);							// ALE CZEMU TUTAJ?
			if (isEmployeeOrCarChoose(x)) {
				switch (x) {
				case 1:
					addEmployeeM();// ta metoda wyrzuca mismatch exception
					break;
				case 2:
					do {
						isCorrectCarData = addCar(scanner, isCorrectCarData, x);
					} while (!isCorrectCarData);
					break;
				case 4:
					addingFieldVariables(scanner4);
					break;
				case 5:	
					employeeToField(sff, scanner4);
					break;
				}// koniec switch
					// scanner.close();
			} else {
				System.out.println("Wrong number, provide again number 1 or 2 ");
			}
		} catch (IncorrectUserInterfaceDataException e) {
			System.out.println(e.getMessage());// wiadomosc z konstruktora

			// scanner.nextInt()//((!(scanner.hasNextInt()==1))||(!(scanner.hasNextInt()==2)))
		}
		scanner.nextLine();// czyszcze System.in
		userInterface(isCorrectCarData);// REKURENCJA - WYWOLUJE SIE PONOWNIE
										// METODA
	}

	private static void addEmployeeM() throws IncorrectUserInterfaceDataException {
		// TODO Auto-generated method stub
		try {
			boolean hasDrivingLicense;
			Scanner scanner1 = new Scanner(System.in);
			// TODO Auto-generated method stub
			System.out.println("Provide the name of a new employee");
			String name = scanner1.next();
			System.out.println("Provide the surname of a new employee");
			String surname = scanner1.next();
			System.out.println("Provide the salary");
			int salary = scanner1.nextInt();
			System.out.println("Does the employee have driving license-press 'y' if so or 'n' if no");
			String drivingLicense = scanner1.next();
			if (drivingLicense == "y") {
				hasDrivingLicense = true;
			} else {
				hasDrivingLicense = false;
			}
			AddEmployee.createEmployee(name, surname, salary, hasDrivingLicense);
			ServiceMethods.showEmployees();
			userInterface(isCorrectCarData);

		} catch (InputMismatchException e) {
			throw new IncorrectUserInterfaceDataException(ExceptionName.INCORRECT_DIGIT_EXCEPTION, "Wrong employee");
		}
	}
	private static void addingFieldVariables(Scanner scanner4) {
		System.out.println("Introduce the customer name");
		String customer = scanner4.next();
		System.out.println("Introduce the city");
		String city = scanner4.next();
		System.out.println("Introduce the start date in the following monenclature dd-MM-yyyy");
		String startDate = scanner4.next();
		System.out.println("Introduce the finish date in the following monenclature dd-MM-yyyy");
		String finishDate = scanner4.next();
		AddField.addField(customer, city, ServiceForField.dateFormatterFromString(startDate), ServiceForField.dateFormatterFromString(finishDate));
		ServiceForField sff= new ServiceForField();
		sff.showAllFields();
	}

	private static void employeeToField(ServiceForField sff, Scanner scanner4) {
		System.out.println("Give the field ID, to which you would like to assign a employee");
		sff.showAllFields();
		int fieldID=scanner4.nextInt();
		System.out.println("Give the employee ID, to which you would like to assign a employee");
		ServiceMethods.showEmployees();
		int employeeID=scanner4.nextInt();
		sff.assignEmployeeToField(fieldID, employeeID);
	}


	
	private static boolean addCar(Scanner scanner, boolean isCorrectCarData, int x)
			throws IncorrectUserInterfaceDataException {
		printCarOption();
		int carSize = getCarSizeFromUser(scanner);
		isCorrectCarData = carChooser(isCorrectCarData, x, carSize);
		return isCorrectCarData;
	}

	private static boolean carChooser(boolean isCorrectCarData, int x, int carSize)
			throws IncorrectUserInterfaceDataException {
		if (carSize == 3) {
			threeSeatsCarM();
			isCorrectCarData = true;
		} else if (carSize == 6) {
			sixSeatsCarM();
			isCorrectCarData = true;

		} else if (isCorrectDataTypeForCar(x)) {
			System.out.println("Wrong number, provide again number 3 or 6");
		} // koniec else if
		return isCorrectCarData;
	}

	private static boolean isCorrectDataTypeForCar(int x) {
		return (x != 3) || (x != 6);
	}

	private static int getCarSizeFromUser(Scanner scanner) throws IncorrectUserInterfaceDataException {
		try {
			// scanner.next();
			int carVariable = scanner.nextInt();
			return carVariable;
		} catch (Exception e) {// jezeli litera a nie cyfra to
											// wyrzuc:
			throw new IncorrectUserInterfaceDataException(ExceptionName.INCORRECT_CAR_SIZE,
					"Wrong input- try again with correct digit: 1 or 2");
		}
	}

	private static boolean isEmployeeOrCarChoose(int x) {
		return x == 1 || x == 2|| x == 4|| x == 5;
	}

	private static void printEmployeeOption() {
		System.out.println("What would you like to do?");
		System.out.println("Add a new employee - press: 1");
		System.out.println("Add a new car - press: 2");
		System.out.println("Add a new field - press: 4");
		System.out.println("Assign employee to a field - press: 5");
	}

	private static void printCarOption() {
		System.out.println("What kind of car would you like to add?");
		System.out.println("Bus 3-seats - press 3");
		System.out.println("Bus 6-seats - press 6");
	}

	private static void sixSeatsCarM() throws IncorrectUserInterfaceDataException {
		try {
			Scanner scanner3 = new Scanner(System.in);
			// Scanner scanner4 = new Scanner(System.in);
			System.out.println("You are adding a bus with 6 seats");
			System.out.println("Introduce the car brand");
			String brand = scanner3.next();
			System.out.println("Give the registration number");
			String regNumber = scanner3.next();
			System.out.println("Give production year");
			String prodYear = scanner3.next();
			System.out.println("Choose the driver from database");
			ServiceMethods.showEmployees();

			driverChooser(scanner3);
			System.out.println("Choose the employee and assign to the current  1st seat in the car ");
			scanner3.nextLine();
			firstSeatChooser(scanner3);// dodaj warunki, gdy pracownik juz jest dopisany do jakiegos auta, to wyrzuc komunikat
			System.out.println("Choose the employee and assign to the current 2nd seat in the car ");
			//scanner3.nextLine();
			secondSeatChooser(scanner3);

			AddCar.CarWithThreeSeats(brand, regNumber, prodYear, driverChooser(scanner3), firstSeatChooser(scanner3),
					secondSeatChooser(scanner3));
			ServiceMethods.showCars();
			scanner3.close();
		} catch (Exception a) {
			System.out.println(a.getMessage());
			sixSeatsCarM();
		}
	}

	private static void threeSeatsCarM() throws IncorrectUserInterfaceDataException {
		try {

			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Introduce the car brand");
			String brand = scanner2.next();
			System.out.println("Provide the registration number");
			String regNumber = scanner2.next();
			System.out.println("Provide production year");
			String prodYear = scanner2.next();
			System.out.println("Choose the driver from database");
			ServiceMethods.showEmployees();

			Driver dr=driverChooser(scanner2);
			//scanner2.nextLine();
			System.out.println("Choose the employee and assign to the current  1st seat in the car ");
			Seat fsc=firstSeatChooser(scanner2);
			System.out.println("Choose the employee and assign to the current 2nd seat in the car ");
			//scanner2.nextLine();
			Seat ssc=secondSeatChooser(scanner2);
			// scanner2.nextLine();

			AddCar.CarWithThreeSeats(brand, regNumber, prodYear, dr, fsc,
					ssc);//dodaje w konstruktorze dr,
	;
			ServiceMethods.showCars();//Fixme
			//scanner2.close();
		} catch (Exception a) {
			// TODO Auto-generated catch block
			System.out.println(a.getMessage());

		}
	}

	private static Seat firstSeatChooser(Scanner scanner2) throws IncorrectUserInterfaceDataException {
		int seat1ID;
		boolean isCorrectData = false;
		do {
			try {
				seat1ID = scanner2.nextInt();
				Employee emp=ServiceMethods.findEmployeeByID(seat1ID);
				isCorrectData = true;
				return new Seat(emp);

			} catch (Exception e) {
				throw new IncorrectUserInterfaceDataException(ExceptionName.INCORRECT_SIGN,
						"This is the letter, insert a digit");

			}
		} while (!isCorrectData);

	}

	private static Seat secondSeatChooser(Scanner scanner1) throws IncorrectUserInterfaceDataException {
		int seat2ID;
		boolean isCorrectData = false;
		do {
			try {
				seat2ID = scanner1.nextInt();
				Employee emp=ServiceMethods.findEmployeeByID(seat2ID);
				isCorrectData = true;
				return new Seat(emp);
				
			} catch (Exception e) {
				throw new IncorrectUserInterfaceDataException(ExceptionName.INCORRECT_SIGN,
						"This is the letter, insert a digit");
			}
			
		} while (!isCorrectData);
		
	}

	private static Driver driverChooser(Scanner scanner) throws IncorrectUserInterfaceDataException {
		int driverID;
		boolean isCorrectData = false;
		do {
			try {
				driverID = scanner.nextInt();
							//if (driverID ==ServiceMethods.findEmployeeByID(driverID).getUniqueID() ) {//wyrzuca nulla z metody findEmployyee, gdy nie znajduje pracownika
				if (ServiceMethods.employees.size()>=driverID){
						if (ServiceMethods.findEmployeeByID(driverID).getHasDrivingLicense() == true) {
						isCorrectData = true;
						return new Driver(ServiceMethods.findEmployeeByID(driverID));
					} else {
						System.out.println("This eployee does not have driving license");
						System.out.println("Choose again correct employee with driving license");

					}
				}
				// scanner.nextLine();// czyszczenie buforu System.in

				else {
					System.out.println("There is no employee with the ID: " + driverID);
					System.out.println("Insert again correct employee ID, between 1 and: "+ServiceMethods.employees.size());
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				throw new IncorrectUserInterfaceDataException(ExceptionName.INCORRECT_SIGN,
						"This is the letter, insert a digit");
			}
		} while (!isCorrectData);

		return null;// nie wyrzuca bledu, przechodzi do poczatku programu
	}
	}
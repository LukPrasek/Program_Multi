package services;

import java.util.Scanner;

import car.CarObjectsStorage;
import employee.EmployeeObjectsStorage;
import field.Field;
import field.FieldObjectsStorage;

public class Test_Main {

	boolean isCorrectData=false;
	
	public static void main(String[] args) {
EmployeeObjectsStorage emplStorage = new EmployeeObjectsStorage();
FieldObjectsStorage newFields=new FieldObjectsStorage();
ServiceForField sff= new ServiceForField();
CarObjectsStorage cos=new CarObjectsStorage();

AddField.addField("MultiMon", "Hamburg", null, null);
Scanner scanner=new Scanner(System.in);
System.out.println("Podaj numer budowy, do ktorej chcesz dopisac pracownika");
sff.showAllFields();
int fieldID=scanner.nextInt();
System.out.println("Podaj numer pracownika, ktory ma byc dopisany do budowy");
ServiceMethods.showEmployees();
int employeeID=scanner.nextInt();

sff.assignEmployeeToField(fieldID, employeeID);
//sff.showAllFields();
//sff.showAllFieldEmployees();
scanner.close();
ServiceMethods.showCars();
}

}
package field;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import employee.Employee;
import services.ServiceForField;

public class Field {

	private String customer;
	private String city;
	private Date startDate;// ="15/01/2017"
	private Date finishDate;
	private static int fieldInterator = 0;
	private int fieldID;

	public Field(String customer, String adress, Date startDate, Date finishDate) {
		this.customer = customer;
		this.city = adress;
		this.setStartDate(startDate);
		this.finishDate = finishDate;
		fieldInterator++;
		this.fieldID = fieldInterator;
		ServiceForField.addFieldToList(this);
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {

		this.startDate = startDate;
	}

	public int getFieldID() {
		return fieldID;
	}

	public void setFieldID(int fieldID) {
		this.fieldID = fieldID;
	}
	 public String toString() {
	 return "ID: " + fieldID + "; Miasto: " + customer + "; Klient: " +city.substring(0, 1).toUpperCase() + city.substring(1);//+ "; Date:"+ startDate;
	 }

}

package services;

import java.util.Date;

import field.Field;

public class AddField {

	
	public static Field addField (String city , String customer, Date startDate,Date finishDate ) {
		Field field=new Field(city, customer, startDate,finishDate );
		return field;
	}
}

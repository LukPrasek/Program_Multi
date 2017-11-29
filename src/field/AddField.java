package field;

import java.util.Date;

public class AddField {

	public Field addField(String customer, String adress, Date startDate, Date finishDate){
		Field field = new Field (customer, adress, startDate, finishDate);
		return field;
	}
	
}

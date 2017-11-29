package field;


import services.AddField;
import services.ServiceForField;

public class FieldObjectsStorage {

		// AddEmployee empl1a= new AddEmployee();
	Field[] table=new Field[8];
		public FieldObjectsStorage() {
			table[0] = AddField.addField("Hamburg", "Amazon",  ServiceForField.dateFormatterFromString("11-11-2017"), ServiceForField.dateFormatterFromString("11-12-2017"));
			table[1] = AddField.addField("Leipzig", "Audi", ServiceForField.dateFormatterFromString("01-02-2017"), ServiceForField.dateFormatterFromString("11-12-2017"));
			table[2] = AddField.addField("Wroclaw", "Zalando", null, null);
			table[3] = AddField.addField("Katowice", "PGNIG", null, null);
			table[4] = AddField.addField("Dortmund", "WERK", null, null);
			table[5] = AddField.addField("Monachium", "BMW", null, null);
			table[6] = AddField.addField("Hannover", "MErcedes", null, null);
			table[7] = AddField.addField("Wolfsburg", "Volkswagen", null, null);
	}
	}


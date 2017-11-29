package exception;

public class IncorrectUserInterfaceDataException extends Exception {
	private ExceptionName name;
	private String message;

	public IncorrectUserInterfaceDataException(ExceptionName name, String message ) {
		this.setName(name);
		this.setMessage(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectUserInterfaceDataException() {
		// TODO Auto-generated constructor stub
	}

	public IncorrectUserInterfaceDataException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public IncorrectUserInterfaceDataException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public IncorrectUserInterfaceDataException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public IncorrectUserInterfaceDataException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public ExceptionName getName() {
		return name;
	}

	public void setName(ExceptionName name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public enum ExceptionName {
		INCORRECT_CAR_SIZE,
		INCORRECT_DIGIT_EXCEPTION,
		INCORRECT_SIGN,
	}
	
}

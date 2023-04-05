package customException;

public class EmployeNotFoundException extends RuntimeException {
	String message;

	public EmployeNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}

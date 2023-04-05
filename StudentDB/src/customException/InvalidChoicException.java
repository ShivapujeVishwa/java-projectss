package customException;

public class InvalidChoicException extends RuntimeException {
	public String message;

	public InvalidChoicException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	

}

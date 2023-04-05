package com.icici;

public class InvalidChoiceException extends Exception {
private String message;
InvalidChoiceException(String message){
	this.message=message;
}
@Override 
public String getMessage() {
	return message;
}
}

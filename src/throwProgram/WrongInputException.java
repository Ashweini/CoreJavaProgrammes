package throwProgram;

public class WrongInputException extends RuntimeException {
	
	String msg;
	
	WrongInputException(){	
	}
	
	WrongInputException(String msg){
		this.msg=msg;
	}
	
	public String getMessage() {
		return msg;
	}
	
}

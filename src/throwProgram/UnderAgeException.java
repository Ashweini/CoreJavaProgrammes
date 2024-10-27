package throwProgram;

public class UnderAgeException extends RuntimeException{
	String msg;
	UnderAgeException(){
		
	}
	UnderAgeException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
		
	}

}

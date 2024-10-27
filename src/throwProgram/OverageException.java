package throwProgram;

public class OverageException extends RuntimeException{
	String msg;
	OverageException(){
		
	}
	
	OverageException(String msg){
		this.msg=msg;
	}
	
	public String getMessage() {
		return msg;
		
	}

}

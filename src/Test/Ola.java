package Test;

public class Ola {
	
	String mini;
	String indica = "cab";
	String Sedon;
	
	Ola(){
		
	}
	
	Ola(String mini){
		this.mini =mini;
	}
	
	Ola(String mini, String indica){
		this(mini);
		this.indica=indica;
	}
	
	Ola(String mini, String indica,String Sedon){
		this(mini,indica);
		this.Sedon=Sedon;
	}
	

}

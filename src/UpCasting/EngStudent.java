package UpCasting;

public class EngStudent extends Student {
	
	String stream;

	EngStudent(){
		
	}
	
	EngStudent(String stream, String name, int stdid){
		super(name, stdid);
		this.stream=stream;
	}
}

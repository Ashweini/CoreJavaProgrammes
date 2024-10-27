package UpCasting;

public class Student  extends Person{
	
	int stdid;
	
	Student(){
		
	}
	
	Student(String name, int stdid){
		super(name);  //instead of writing name again I can use super to use constructore of Person
		this.stdid=stdid;
		
	}

}

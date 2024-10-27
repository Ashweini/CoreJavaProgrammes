package ConstructorProgram;

public class Student {
	int rollno;
	String name;
	double marks;
	
	//constructor
	public Student(){
		
	}
	
	public Student(int rollno){
		this.rollno=rollno;
	}
	
	Student(int rollno, String name){
		this.rollno=rollno;
		this.name = name;
	}
	
	Student(String name, int rollno){
		this.rollno=rollno;
		this.name = name;
	}
	
	Student(int rollno, String name, double marks){
		this.rollno=rollno;
		this.name = name;
		this.marks = marks;
	}
	
	

}

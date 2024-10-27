package EqualsMethod;

public class Student {
	
	String name;
	int Sid;
	
	Student(String name, int Sid){
		this.name=name;
		this.Sid=Sid;
	}
	
	public boolean equals(Object O) {
		Student b1 = (Student)O;//past onbject
		//return this.name==b1.name && this.Sid==Sid ;
		if(this.name==name) //&& this.Sid==Sid) 
			return true;
		else if(this.Sid==Sid)
		    return true;
		else
			return false;
		
	}

}

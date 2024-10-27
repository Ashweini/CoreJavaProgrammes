package SuperCallStatement;

public class Student extends Person{
	int stdId;

	Student(){
		
	}
	
	//we can create a constructor non static memnber of parent and child by using inheritance 

	Student(int stdId, String name){
		super(name);
		this.stdId=stdId;
	}

}

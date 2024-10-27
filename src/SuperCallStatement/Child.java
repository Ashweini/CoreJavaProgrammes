package SuperCallStatement;

public class Child extends Parent{
	
	int j;
	Child(){
		super();
		System.out.println("child class");
	}
	
	Child(int j){
		this(); //this will no argument constructor
		this.j=j;
	}

}

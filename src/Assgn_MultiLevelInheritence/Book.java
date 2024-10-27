package Assgn_MultiLevelInheritence;

public class Book extends Library {
	
	String Fiction;
	String Non_Fiction;
	
	Book(String Fiction, String Non_Fiction){
		this.Fiction=Fiction;
		this.Non_Fiction=Non_Fiction;
	}
	
	//Display the books 
	void Display() {
		System.out.println("Fiction Book : "+Fiction);
		System.out.println("Non Fiction Book : "+Non_Fiction);
	}
	

}

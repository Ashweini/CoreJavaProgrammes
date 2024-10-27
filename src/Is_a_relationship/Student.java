package Is_a_relationship;

public class Student extends Person{
	
	public void DisplayStudent(String name, int age) {
		//name of student 
		System.out.println("Name of Student : "+name);
		//age of student 
		System.out.println("age of student : "+age);
		//School name of student 
		System.out.println("Schook=l name : "+SchoolName);
		
		//Non static method call
		Walk();
		
		//static method call
		Walk1(); //static can be access inside non static block
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.DisplayStudent("xyz", 25);
		
		//Walk(); - non static cann't be possible acess inside static block
		
		//static method ca;;
		Walk1(); // static can we acces sinside static block

	}

}

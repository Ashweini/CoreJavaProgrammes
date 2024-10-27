package Encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 
		Employee e1 = new Employee();
		//2
		Employee e2= e1;
		Employee e3 = e2;
		Employee e4 = e3;
		Employee e5 = e4;
		
		//3
		e1.id=123;
		e1.name="ashwini";
		e1.phnol=12345;
		
		
		//4
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.phnol);
		
		//5
		e4.id=456;
		e4.name="ashu";
		e4.phnol=678904;
		
		//6
		System.out.println(e5.id);
		System.out.println(e5.name);
		System.out.println(e5.phnol);
		

	}

}

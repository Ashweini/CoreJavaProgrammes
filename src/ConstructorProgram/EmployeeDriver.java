package ConstructorProgram;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee E1 = new Employee(123, "Ashwini", "Tester");
		Employee E2 = new Employee(124, "Sharadha", "Trainer");	
		
		System.out.println(E1.id +" "+ E1.name+ " "+E1.Dept);

	}

}

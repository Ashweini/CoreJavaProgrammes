package ObjectClassNonStaticMethod_assgn;

public class EmployeeDriver {

	public static void main(String[] args) {


		Employee e1 = new Employee("ashwini", 111, 10000);
		Employee e2 = new Employee("ashwini", 111, 10000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.hashCode()==e2.hashCode());
	}

}

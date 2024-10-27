package Collection_FrameWork;

import java.util.ArrayList;

public class Driver_ArrayList_Employee {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		
		Employee e1 = new Employee(1, "xyz", 1000);
		a1.add(e1);
		
		a1.add(new Employee(2, "abc", 100));
		a1.add(new Employee(3, "pgf", 200));
		a1.add(new Employee(4, "efg", 300));
		
		System.out.println("No. of Employees :  "+a1.size());
		System.out.println(a1);
		
	}



}

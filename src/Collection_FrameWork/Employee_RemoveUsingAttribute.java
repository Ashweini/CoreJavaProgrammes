package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee_RemoveUsingAttribute {
	
	public static void main(String[] args) {
		
	ArrayList<Employee> Employees = new ArrayList<Employee>();
	Employees.add(new Employee(1, "Ashwini",100.0));
	Employees.add(new Employee(1, "Sharaddha",200.0));
	Employees.add(new Employee(1, "Priyanka",300.0));
	
	for(Employee e : Employees) {
		System.out.println(e);
	}
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name of the emploee to be removed");
	String name = s.nextLine();
	
	/**
	 * step 1 - search by attribute
	 * step 2 - if element found, preserve the Object
	 * and then remove by using remove(Object)
	 */
	
	Iterator<Employee> i = Employees.iterator();
	Employee tobeRemoved  = null;
	while(i.hasNext()) {
		Employee e = i.next();
		if(e.getName().equals(name)) {
			tobeRemoved=e;
		}
	}
	if(tobeRemoved != null) {
		Employees.remove(tobeRemoved);
		System.out.println("=======After Removal========");
		for (Employee e : Employees) {
			System.out.println(e);
		}
	}else {
		System.out.println(name + " doesn't exit");
	}
	
	}	
}

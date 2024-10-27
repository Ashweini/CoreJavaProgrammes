package EqualsMethod;

public class EmplyeeDriver {

	public static void main(String[] args) {

		Employee e1 = new Employee("ashwini",111,"#124 Indiranagr");
		Employee e2 = new Employee("ashwini",111,"#124 Indiranagr");
		Employee e3 = new Employee("ashwini",121,"#124 Indiranagr");
//		
		
		System.out.println(e1.equals(e2));//true
		System.out.println(e1.equals(e3));//false

	}

}

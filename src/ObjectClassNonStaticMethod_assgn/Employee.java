package ObjectClassNonStaticMethod_assgn;

import EqualsMethod.Box;

public class Employee {
	private String name;
	private int id;
	private double Salary;
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id=id;
		this.Salary=salary;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public void setSalary(double salary) {
		this.Salary=Salary;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	//equals method
	public boolean equals(Object O) {
		Employee b1 = (Employee)O;//past onbject
		if(this.name.equals(b1.name) && this.id==b1.id && this.Salary==b1.Salary) {
			return true;
		}
		return false;
	}
	
	//hash code method
	public int hashCode() {
		return this.name.hashCode()+id+(int)Salary; //primitive typeCasting
	}

}

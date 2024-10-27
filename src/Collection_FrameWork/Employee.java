package Collection_FrameWork;

import java.util.Objects;

public class Employee {

		private int id;
		private String name;
		private double Salary;
		
		public void setId(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public double getSalary() {
			return Salary;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		
		//Constructor
		public Employee(int id, String name, double Salary){
			setId(id);
			setName(name);
			setSalary(Salary);	
		}
		
		public Employee(int id, String name){
			setId(id);
			setName(name);
		}
		
		//Overriding toString MEthod
		public String toString() {
			return "[Employee Id : "+id+", Empname : "+name+", Salary : "+Salary+"]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(Salary, id, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Double.doubleToLongBits(Salary) == Double.doubleToLongBits(other.Salary) && id == other.id
					&& Objects.equals(name, other.name);
		}
		
		
		
		


}

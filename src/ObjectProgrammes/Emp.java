package ObjectProgrammes;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp emp = new Emp();
		System.out.println(emp);
		
		Emp emp2 = new Emp();
		System.out.println(emp2);
		
		System.out.println(emp==emp2); //false
		
		Emp emp3 = emp2;
		System.out.println(emp3==emp2);//true
		
		

	}

}

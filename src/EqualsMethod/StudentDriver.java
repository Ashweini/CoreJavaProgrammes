package EqualsMethod;

public class StudentDriver {

	public static void main(String[] args) {


		Student b3 = new Student("Ashwini", 111);
		Student b4 = new Student("Ashwini",221);
		System.out.println(b3==b4);  //false
		System.out.println(b3.equals(b4)); //true

	}

}

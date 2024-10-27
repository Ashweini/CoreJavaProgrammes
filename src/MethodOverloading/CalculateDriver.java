package MethodOverloading;

public class CalculateDriver {

	public static void main(String[] args) {


		Calculator c = new Calculator();
		double Cobj=c.add(5, 5);
		System.out.println(Cobj);
		c.add(5, 5, 5);
		c.add(5.5, 5);

	}

}

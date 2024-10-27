package InstanceOfOperator;

public class MainAppTocheckInstanceOf {

	public static void main(String[] args) {


		Object o = new A(); //created object of child class A
		
		System.out.println(o instanceof Object); //true
		System.out.println(o instanceof A);  //true
		//inside A object we have properties of -> Object supermost class and A class properties 
		//superclass A doesn't inherits child => childs will inherits parent 
		System.out.println(o instanceof B);//fasle
		System.out.println(o instanceof C);//false
		System.out.println(o instanceof D);//false
		
		System.out.println("--------created D object------------");
		Object o1 = new D();
		
		System.out.println(o1 instanceof Object); //true
		System.out.println(o1 instanceof A);  //true
		System.out.println(o1 instanceof B);//false
		System.out.println(o1 instanceof C);//true
		System.out.println(o1 instanceof D);//true

	}

}

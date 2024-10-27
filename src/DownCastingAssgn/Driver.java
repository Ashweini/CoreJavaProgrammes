package DownCastingAssgn;

public class Driver {

	public static void main(String[] args) {


		//case-1 : Create ref_var of A class and store c object reference 
		A a=new C();
		//Upcasting access member parent class object
		System.out.println(a.i);   //200
		//DownCasting acess member of Child class
		C c= (C)a;
		System.out.println(c.i);  //200
		System.out.println(c.j);  //300
		System.out.println(c.K);  //400
		System.out.println("----------------------------------------------------");
		
		//Case -2 : create ref_var of B class and store E object
		B b = new E();
		//Upcasting access member parent class object
		System.out.println(b.i);   //200
		System.out.println(b.j);   //300
		//DownCasting acess member of Child class
		E e=(E)b;
		System.out.println(e.Emem);   //Emember
		System.out.println(e.i);      //200
		System.out.println(e.j);      //300
		System.out.println(e.K);      //400
		System.out.println("--------------------------------------------------------");
		
		//Case 3 : create reference variable of Class A and store B object
		A a1=new B();
		System.out.println(a1.i);    //200
		B b1=(B)a1;
		System.out.println(b1.i);    //200
		System.out.println(b1.j);    //300
		



	}

}

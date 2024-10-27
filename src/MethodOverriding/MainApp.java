package MethodOverriding;

public class MainApp {

	public static void main(String[] args) {

		Fruit f=new Fruit();
		f.Demo();   //parent
		
		//Upcasting
		Fruit f1=new Apple();
		f1.Demo();  //child
		
		//according to the compiler : Fruite class demo method 
		//during the execution Apple class demo executed

	}

}

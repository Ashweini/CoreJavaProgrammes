package EqualsMethod;

public class BoxDriver {

	public static void main(String[] args) {


		Box b3 = new Box(200);
		Box b4 = new Box(200);
		System.out.println(b3==b4);  //false
		System.out.println(b3.equals(b4)); //true
		

	}

}

package Encapsulation;

public class GetterSetterDriver {

	public static void main(String[] args) {

		GetterSetterMethods price = new GetterSetterMethods();
		
		//store 2000 into price
		price.setPrice(2000);
		System.out.println(price.getPrice());
		

	}

}

package LazyInstantiation;

public class CarDriver {

	public static void main(String[] args) {


		Car c = new Car();
		System.out.println(c.getTyres());
		
		//add tyre object
		c.addTyre(new Tyre("Appollo"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("Appollo"));
		c.addTyre(new Tyre("MRF"));
		
		for(int i=0; i<c.getTyres().length; i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}

	}

}

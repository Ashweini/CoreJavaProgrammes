package Assignment_08_08_Has_A_oneToMany;

public class ClassDriver {

	public static void main(String[] args) {


		Car c = new Car();
		System.out.println("No of Tyres : "+c.getTyres().length);
		
		//to print brand of all tyres
		for(int i=0; i<c.getTyres().length; i++) {
			System.out.println(c.getTyres()[i].getBrand()	);
		}

	}

}

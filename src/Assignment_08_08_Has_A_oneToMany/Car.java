package Assignment_08_08_Has_A_oneToMany;

public class Car {
	
	//achieve has a relationship
	//using early instantiation technique
	
	private Tyre[] tyres = { new Tyre("Apollo"),
							new Tyre("MRF"),
							new Tyre("Apollo1"),
							new Tyre("MRF1")};
	
	//getter
	public Tyre[] getTyres() {
		return tyres;
							
	}
}

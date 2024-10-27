package LazyInstantiation;

public class Car {
	
	private Tyre[] tyres = new Tyre[4];
	
	//varibale act as index
	int i=0;
	
	//helper method to instantiate tyre object
	void addTyre(Tyre tyre) {
		tyres[i++] = tyre;
	}
	
	//getter
	public Tyre[] getTyres() {
		return tyres;
	}
	
	

}

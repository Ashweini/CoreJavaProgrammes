package MethodOverriding;

public class Ola {
	//achieving Has-A with cab
	
	private Cab cab;
	
	//getter
	public Cab getCab() {
		return cab;
	}
	
	//helper method for instantiation
	void bookCab(Cab cab) {
		this.cab=cab;
		cab.PrintThanks();
	}
	

}

package Has_A_Relationship;

public class Engine {
	
	private double hp;
	
	//getter method
		public double getHp() {
			return hp;
			
		}
	
	//setter method
	public void setHp(double hp) {
		this.hp=hp;
	}
	
	//constructor- we can assign directly - load non static members to the object
	Engine(double hp){
		setHp(hp);
	}

}

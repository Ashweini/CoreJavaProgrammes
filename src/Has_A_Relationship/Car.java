package Has_A_Relationship;

public class Car {

	private String Model_name;
	
	//getter method 
	public String getModelName() {
		return Model_name;
		
	}
	
	//setter method
	public void setModelName(String Model_name ) {
		this.Model_name=Model_name;
	}
	
	
	//achieving has-A relationship
	private Engine e=new Engine(1000);
	
	//getter method
	public Engine getEngine() {
		return e;
	}
	
	//constructor
	Car(){
		
	}
	
	Car(String Model_name){
		setModelName(Model_name);
	}
	
//	//setter method
//	public void setEngine(Engine e1 ) {
//		this.e=e;
//	}
//	
}

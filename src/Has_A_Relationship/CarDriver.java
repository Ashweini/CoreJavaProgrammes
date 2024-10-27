package Has_A_Relationship;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a car object
		Car c1=new Car("BMW");
		
		//fetch modelName and hp
		System.out.println(c1.getModelName());
		System.out.println(c1.getEngine().getHp());

	}

}

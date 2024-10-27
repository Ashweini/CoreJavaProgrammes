package Has_A_Relationship;

public class _07_08_assignment_phoneDriver {

	public static void main(String[] args) {
		
		
	//create phone object
		_07_08_assignment_Phone p1 = new _07_08_assignment_Phone("iphone");
		
		//fetch and print sim and phonename
		System.out.println("phone NAme : "+p1.getPhoneName());
		System.out.println("simCArd name : "+p1.getSimCard().getSim());

	}

}

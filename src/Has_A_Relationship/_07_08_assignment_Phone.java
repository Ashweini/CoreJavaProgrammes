package Has_A_Relationship;

public class _07_08_assignment_Phone {
		private String phoneName;
		
		//getter
		public String getPhoneName() {
			return phoneName;
		}
		
		//setter 
		public void setPhoneName(String phoneName) {
			this.phoneName=phoneName;
		}
		
		//constructor 
		_07_08_assignment_Phone(){
			
		}

		_07_08_assignment_Phone(String phoneName){
			setPhoneName(phoneName);
		}
		
		//Achieving Ha-A relationship
		private _07_08_assignment_SimCard s1=new _07_08_assignment_SimCard("Jio");
		
		//getter
		public _07_08_assignment_SimCard getSimCard() {
			return s1;
		}
		
	
		

}


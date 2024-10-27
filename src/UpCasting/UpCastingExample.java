package UpCasting;

public class UpCastingExample {

	public static void main(String[] args) {


		Student s1 = new Student("Ashwini",111); //s1 belong to the cild type
		Person p1=s1;                            //p1 belongs to the - parent type
		
		System.out.println(s1);  
		System.out.println(p1);
		System.out.println(s1==p1); //true
		
		System.out.println(s1.name + " "+s1.stdid );
		//System.out.println(p1.name+ " "+p1.sId); //Once Upcasted can't be possible to acces subclass members CTE at p1.sid
		
		//Explicit Upcasting
		 Person p2=(Person)new Student("ashwini", 124);
		 
		// System.out.println(p2.name+ " "+p2.stdid); //sid can't be able to access
		 
		 //after Upcasting we can't access subclass members 

	}

}

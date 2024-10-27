package Collection_FrameWork;

import java.util.ArrayList;

public class Assgn_Strudent_Driver {

	public static void main(String[] args) {
		Assgn_Student_CustomObject a = new Assgn_Student_CustomObject(123, "adc", 13);
		Assgn_Student_CustomObject a1 = new Assgn_Student_CustomObject(456, "xyz", 14);
		
		//------------
		a.setAge(19);
		a.setName("Ashwini");
		a.setId(987);
		
		System.out.println(a.getAge());
		System.out.println(a.getId());
		System.out.println(a.getName());
		
		System.out.println(a.equals(a1)); 
		System.out.println(a==a1);
		
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		
		System.out.println(a.toString());
		System.out.println(a1.toString());
		
//ArrayList
		ArrayList al = new ArrayList();
		al.add(new Assgn_Student_CustomObject(1, "xyz", 24));
		al.add(new Assgn_Student_CustomObject(2, "anc", 25));
		al.add(new Assgn_Student_CustomObject(3, "abc", 26));
		
		Assgn_Student_CustomObject ele = new Assgn_Student_CustomObject(1, "xyz", 24);
		System.out.println(al.contains(ele));//true
		System.out.println(al.indexOf(ele));	
		
	}

}

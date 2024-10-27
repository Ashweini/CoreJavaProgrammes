package Collection_FrameWork;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Student_Driver2 {

	public static void main(String[] args) {
		//ArrayList
				ArrayList al = new ArrayList();
				al.add(new Assgn_Student_CustomObject(1, "xyz", 24));
				al.add(new Assgn_Student_CustomObject(2, "anc", 25));
				al.add(new Assgn_Student_CustomObject(3, "abc", 26));
				
				//search based on id
				//keyelement is student id 
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the student id");
				int keyElement = s.nextInt();
				
				//we need ti iterate each and every element in the list
				//using list iterator 
				ListIterator i = al.listIterator(0);
				boolean found = false;
				while(i.hasNext()) {
					Assgn_Student_CustomObject temp = (Assgn_Student_CustomObject)i.next();
					if(temp.getId() == keyElement) {
						found =true;
						break;
					}
				}

//-------------------------------
				//search based on age
//				System.out.println("Enter the student age");
//				int keyElement1 = s.nextInt();
//				
//				//we need ti iterate each and every element in the list
//				ListIterator i1 = al.listIterator(0);
//				boolean found1 = false;
//				while(i.hasNext()) {
//					Assgn_Student_CustomObject temp = (Assgn_Student_CustomObject)i1.next();
//					if(temp.getAge() == keyElement1) {
//						found1 =true;
//						break;
//					}
//				}

//---------------------------------
				//search based on age
//				System.out.println("Enter the student Name");
//				String keyElement2 = s.next();
//				
//				//we need ti iterate each and every element in the list
//				ListIterator i2 = al.listIterator(0);
//				boolean found2 = false;
//				while(i.hasNext()) {
//					Assgn_Student_CustomObject temp = (Assgn_Student_CustomObject)i2.next();
//					if(temp.getName()==keyElement2) {
//						found2 =true;
//						break;
//					}
//				}
				
	}

}

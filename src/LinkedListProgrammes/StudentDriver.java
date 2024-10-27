package LinkedListProgrammes;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Collection_FrameWork.Employee;

public class StudentDriver {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(new Student(55, "Zoel"));
		l.add(new Student(60,"Yu"));
		l.add(new Student(45,"Xray"));
		l.add(new Student(70, "Ash"));
		
		System.out.println(l);	
		Collections.sort(l);	
		System.out.println(l);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name you want to remove");
		String name = s.nextLine();
		
		Iterator<Student> i = l.iterator();
		Student tobeRemoved  = null;
		while(i.hasNext()) {
			Student e = i.next();
			if(e.getName().equals(name)) {
				tobeRemoved=e;
			}
		}
		
		if(tobeRemoved != null) {
			l.remove(tobeRemoved);  
			System.out.println("=======After Removal========");
			System.out.println(l);
		}else {
			System.out.println(name + " doesn't exit");
		}
		
		System.out.println(l);
	}

}

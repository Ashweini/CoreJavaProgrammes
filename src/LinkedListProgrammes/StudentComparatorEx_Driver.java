package LinkedListProgrammes;

import java.util.Collections;
import java.util.LinkedList;

import Collection_FrameWork.StudentComaparator;

public class StudentComparatorEx_Driver {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(new StudentComparatorEx(55));
		l.add(new StudentComparatorEx(60));
		l.add(new StudentComparatorEx(45));
		l.add(new StudentComparatorEx(70));
		
		System.out.println(l);
		
//		Collections.sort(l);
		
		Collections.sort(l, new LL_StudentComparatorEx_Comparator());
		System.out.println(l);

	}

}

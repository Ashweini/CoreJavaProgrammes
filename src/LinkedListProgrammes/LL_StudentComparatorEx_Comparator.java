package LinkedListProgrammes;

import java.util.Comparator;

import Collection_FrameWork.Student;

public class LL_StudentComparatorEx_Comparator implements Comparator<StudentComparatorEx>{

	@Override
	public int compare(StudentComparatorEx o1, StudentComparatorEx o2) {
		return o1.marks-o2.marks;
	}
}

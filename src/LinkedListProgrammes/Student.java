package LinkedListProgrammes;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{

	
	int marks;
	String name;
	Student(int marks, String name){
		this.marks=marks;
		this.name=name;
	}
		
	public int getMarks() {
		return marks;
	}
    public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name);
	}
	
	
	
}

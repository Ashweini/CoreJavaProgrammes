package ContructorChaining;

public class Student1 {
	
		int rollno;
		String name;
		double marks;
		
		//constructor
		Student1(){			
		}
		
		Student1(int rollno){
			this.rollno=rollno;
		}
		
		Student1(int rollno, String name){
			this(rollno);
			this.name = name;
		}
		
		Student1(String name, int rollno){
			this(rollno, name);
		}
		
		Student1(int rollno, String name, double marks){
			this(rollno, name);
			this.marks = marks;
		}
	}

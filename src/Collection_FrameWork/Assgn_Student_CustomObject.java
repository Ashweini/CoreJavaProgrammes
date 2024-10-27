package Collection_FrameWork;

import java.util.Objects;

import EqualsMethod.Student;

public class Assgn_Student_CustomObject {
	
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//Constructor
	Assgn_Student_CustomObject(){
	
	}

Assgn_Student_CustomObject(int id){
	this.id=id;
}

Assgn_Student_CustomObject(int id, String name){
	this.id=id;
	this.name=name;
	
}

Assgn_Student_CustomObject(int id, String name, int age){
	this.id=id;
	this.name = name;
	this.age = age;
}

	
//toString
@Override
public String toString() {
	return "Assgn_Student_CustomObject [id=" + id + ", name=" + name + ", age=" + age + "]";
}

//hashcode
@Override
public int hashCode() {
	return Objects.hash(age, id, name);
}


//equals

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Assgn_Student_CustomObject other = (Assgn_Student_CustomObject) obj;
	return age == other.age && id == other.id && Objects.equals(name, other.name);
}


//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	Assgn_Student_CustomObject(){
//		
//	}
//	
//	Assgn_Student_CustomObject(int id){
//		this.id=id;
//	}
//	
//	Assgn_Student_CustomObject(int id, String name){
//		this.id=id;
//		this.name=name;
//		
//	}
//	
//	Assgn_Student_CustomObject(int id, String name, int age){
//		this.id=id;
//		this.name = name;
//		this.age = age;
//	}
//	
////toString
//	public String toString() {
//		return "[id : "+id +", Name : "+name+", Age : "+age+"]";
//		
//	}
//	
////equals method
//	public boolean equals(Object O) {
//		Assgn_Student_CustomObject b1 = (Assgn_Student_CustomObject)O;
//		if(this.name==name) 
//			return true;
//		else if(this.id==id)
//		    return true;
//		else
//			return false;
//	
//	}
//	
////hashCode method
//	
//	public int hashCode() {
//		return this.name.hashCode()+(int)id; //primitive typeCasting
//	}
}

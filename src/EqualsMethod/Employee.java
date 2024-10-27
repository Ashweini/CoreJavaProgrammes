package EqualsMethod;

public class Employee {
	private String name;
	private int id;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getName return the name - return type String
	public String getName(String Name) {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId(int id) {
		return id;
	}

	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress(String address) {
		return address;
	}
	
	
	
	//constructors 
	Employee(){
		
	}
	
	public Employee(String name, int id, String address){
		setName(name);
		setId(id);
		setAddress(address);
	}
	


	//Overrriding supermost Object class equals(object O) method
	public boolean equals(Employee o) {  //if I use child class no need to Downcast so we can avoid 
		if( this.name.equals(o.name) && this.id==o.id && this.address.equals(o.address)) {
			return true;
		}
		return false;	
	}
	
}

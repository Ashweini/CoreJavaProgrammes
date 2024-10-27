package MultiLevelInheritence;

public class Triangle extends Shape{
	double base;
	double height;
	
	Triangle(double base, double height){
		this.base=base;
		this.height=height;
	}
	
	//to display the properties of triangle
	void display() {
		System.out.println("Height : "+height);
		System.out.println("Base : "+base);
	}

}

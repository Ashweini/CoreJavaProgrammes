package Non_Static_Method;

public class Box {
	double length;
	double breadth;
	
	//Constructor
	Box(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	//non-static method
	double getArea() {
		return length*breadth;
	}

}

package HirarchicalInheritance;

public class Triangle extends Shape {

	double base;
	double height;
	
//	Triangle(double base, double height){
//		this.base=base;
//		this.height=height;
//		
//	}
	
	double areaOfTriangle(double base, double height) {
		return 0.5*base*height;
	}
	
}

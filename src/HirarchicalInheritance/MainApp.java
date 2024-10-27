package HirarchicalInheritance;

public class MainApp {

	public static void main(String[] args) {

		Triangle t1 = new Triangle();
		System.out.println("Area of Triangle : "+t1.areaOfTriangle(4, 4));
		
		Circle c1 = new Circle();
		System.out.println("Area of Circle : "+c1.areaOfCircle(5));
		
		Square s1 = new Square();
		System.out.println("Area of square : "+s1.areaOfSquare(7));
		
	}

}

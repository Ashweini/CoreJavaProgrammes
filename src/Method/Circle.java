package Method;

public class Circle {
	
	public double getArea(double  radius) {
		double area = 3.142*radius*radius;
		System.out.println(area);
		
		return area;
	}

	public static void main(String[] args) {
		
		Circle c=new Circle();
		double AreaOfCircle = c.getArea(5.5);
		System.out.println("Area of circle is "+AreaOfCircle);

	}

}

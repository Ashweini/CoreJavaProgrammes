package ContructorChaining;

public class Box {
	double length, width, area;
	
	Box(){
		System.out.println("Box is getting ready...");
	}
	Box(double length){
		this();
		this.length = length;
		System.out.println("Length is intialized...");
	}
	Box(double length, double width){
		this(length);
		this.width=width;
		System.out.println("Width is initialised...");
	}
	Box(double length, double width,double area){
		this(length, width);
		this.area=area;
		System.out.println("Area is initialised...");
	}
}

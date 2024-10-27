package ContructorChaining;

public class BoxDriver {

	public static void main(String[] args) {
		double length=4.3;
		double width = 4.6;
		
		Box b1 = new Box(length, width, length*width);
		System.out.println(b1.area);
	}

}

package MultiLevelInheritence;

public class MainApp {

	public static void main(String[] args) {


		RightAngleTriangle t1 = new RightAngleTriangle(3, 4);
		
		//help of t1, can I access the area
		System.out.println(t1.area);
		
		//help of t1, can I access the properties of triangle 
		System.out.println(t1.base);
		System.out.println(t1.height);
		
		//shape class  method
		t1.computeArea();
		
		//triangle class method
		t1.display();

	}

}

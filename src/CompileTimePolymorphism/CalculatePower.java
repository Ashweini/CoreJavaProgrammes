package CompileTimePolymorphism;

public class CalculatePower {
	
	public int Power(int a, int b) {
		return a*b;
	}
	
	public int Power(int a, int b, int c) {
		return a*b*c;
	}
	
	public double Power(double a, double b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		
		//compile time binding
		CalculatePower c= new CalculatePower();
		System.out.println(c.Power(5, 5));
		System.out.println(c.Power(5, 5, 5));
		System.out.println(c.Power(5.5, 5.5));
		
	}
}

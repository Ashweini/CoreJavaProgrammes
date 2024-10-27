package RunTImeBinding;

public class Calculation2 extends CalculateSum {
	
	public int sum(int a, int b) {
		return a*b;
	}
	
	
	public static void main(String[] args) {
		CalculateSum s = new Calculation2();
		System.out.println(s.sum(5, 5));
	}

}


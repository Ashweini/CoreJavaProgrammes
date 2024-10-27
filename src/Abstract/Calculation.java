package Abstract;

public abstract class Calculation {
	
	abstract int add(int a, int b);
	
	abstract int div(int a, int b);
	
	abstract int mul(int a, int b);
	
	public int sub(int a, int b) {
		return a-b;
	}

}

package Interface;

public interface Demo2 {
	
	//we can't able to create object that'y it's static
	//final we have to initilize. we can't re-initialise this value of variable 
	public static final int a = 10;
	
	//before jdk-8 only abstract methods are allowed inside interface
	//after jdk-8 non-abstract static methods are allowed(static should be complete method)
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Demo2.a);
	}

}

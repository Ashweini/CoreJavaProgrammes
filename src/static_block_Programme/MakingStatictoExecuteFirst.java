package static_block_Programme;

public class MakingStatictoExecuteFirst {

	static int i= test();
	public static int test() {
		System.out.println("from test() i :"+i);
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("i :"+i);
		
	}

}

package toStringMethod;

public class phoneDriver {

	public static void main(String[] args) {


//		phone p1 = new phone(128, 8);
//		phone p2 = new phone(64, 4);
//		
//		System.out.println("Output ->");
//		System.out.println(p1);
//		System.out.println(p2);
		
		phone[] p = new phone[5];
		p[0] = new phone(64, 4);
		p[1] = new phone(128, 8);
		p[2] = new phone(8, 4);
		p[3] = new phone(265, 64);
		p[4] = new phone(645, 8);
		
		for(int i=0; i<p.length;i++) {
			System.out.println(p[i]);
		}
		

	}

}

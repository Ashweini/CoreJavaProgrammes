package QueueProgrammes;

import java.util.ArrayDeque;

public class ArrayDequeueProgram {

	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque();
		a.offer(10);
		a.offer(20);
		a.offer(30);
		a.offer(40);
		
		System.out.println(a);//[10, 20, 30, 40]
		
		a.addFirst(5);
		System.out.println(a);//[5, 10, 20, 30, 40]
		
		a.addLast(45);
		System.out.println(a);//[5, 10, 20, 30, 40, 45]
		
		System.out.println(a.removeFirst());//5
		System.out.println(a);
		
		System.out.println(a.removeLast());//45
		System.out.println(a);//[10, 20, 30, 40]
		
		System.out.println(a.getFirst());//first element - 10
		
		System.out.println(a.getLast());//Last element - 40
	}

}

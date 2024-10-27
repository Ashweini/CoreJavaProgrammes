package QueueProgrammes;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueString {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue();
		System.out.println(p.peek());//queue is empty returns the null 
		System.out.println(p.poll());//queue is empty returns the null 
		p.add("abc");
		p.add("efg");
		p.add("hij");
		p.add("lmn");
		p.add("opq");
		
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		
		System.out.println(p.remove("hij"));
		System.out.println("after removing : "+p);
		
		PriorityQueue p2 = new PriorityQueue();
		p2.offer("ash");
		p2.offer("amm");
		p2.offer("nnn");
		
		//collection inside collection
		p.addAll(p2);
		System.out.println(p);//[amm, ash, nnn, lmn, efg, opq]
		
		Iterator i = p2.iterator();
		System.out.println("By iterator : ");
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		
	}

}

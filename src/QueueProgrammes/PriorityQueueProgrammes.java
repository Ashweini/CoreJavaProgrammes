package QueueProgrammes;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueProgrammes {
	public static void main(String[] args) {
	PriorityQueue p = new PriorityQueue();
	System.out.println(p.peek());//queue is empty returns the null 
	System.out.println(p.poll());//queue is empty returns the null 
	p.add(70);
	p.add(44);
	p.add(30);
	p.add(33);
	p.add(5);
	//p.add(null);
	//1st element is sorted rest all random
	System.out.println(p);
	
	//peek() - retrive , but not remove the element 
	System.out.println(p.peek());
	
	//poll() - retrieve the data as well as remove the data
	System.out.println(p.poll());//5
	
	System.out.print("after removing : "+p+" ");
	System.out.println();
	
	System.out.println(p.remove(30));
	System.out.print("From remove : "+p+" ");
	
	PriorityQueue p2 = new PriorityQueue();
	System.out.println(p2.offer(20));  //true - space their and added value in priorityQueue
	p2.offer(10);
	p2.offer(30);
	p2.offer(1);
	p2.offer(2);
	//1st element is sorted rest all random
	System.out.println(p2);//[1, 2, 30, 20, 10]
	
	Iterator i = p2.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+" ");
	}
	}

}

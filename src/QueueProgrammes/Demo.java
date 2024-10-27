package QueueProgrammes;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {

	public static void main(String[] args) {
		ArrayBlockingQueue queu = new ArrayBlockingQueue(3);
		queu.add(3);
		queu.add(2);
		queu.add(1);
		//queu.add(4);//Queue is full - java.lang.IllegalStateException
		
		System.out.println(queu);
		
		ArrayBlockingQueue que = new ArrayBlockingQueue(3);
		System.out.println(que.offer(70));//true -space is their added 
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		
		System.out.println(que);//[70, 10, 20]
		
		//queue is full so getting false instead of exception like add
		System.out.println(que.offer(70));//false
	}
}

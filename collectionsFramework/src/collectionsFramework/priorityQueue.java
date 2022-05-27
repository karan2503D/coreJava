package collectionsFramework;
import java.util.*;

public class priorityQueue {

	public static void main(String[] args) {
		
	PriorityQueue pq = new PriorityQueue<>();
	pq.add(10);
	pq.add(20);
	pq.add(30);
	pq.add(40);
	pq.add(50);
	System.out.println(pq.peek());
	
	pq.poll();
	System.out.println(pq.peek());
	}

}

package _AlgorithmsFolder._Stacks;

public class PriorityQueueHandler {

	public static void main(String[] args) {
		int size = 10;
		PriorityQueue pq = new PriorityQueue(size);
		
		pq.insert(10);
		pq.insert(15);
		pq.insert(3);
		pq.insert(22);
		pq.insert(1);
		
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
	}
}



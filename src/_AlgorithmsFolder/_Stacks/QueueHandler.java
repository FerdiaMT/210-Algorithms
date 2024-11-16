package _AlgorithmsFolder._Stacks;

public class QueueHandler {
	public static void main(String[] args) {
		int size = 6;
		Queue queue = new Queue(size);
		queue.insert(1);
		queue.insert(5);
		queue.insert(10);
		queue.insert(15);
		queue.insert(20);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		queue.insert(100);
		System.out.println(queue.remove());
		
		queue.insert(100);
		System.out.println(queue.remove());
		
		queue.insert(100);
		System.out.println(queue.remove());
		
		queue.insert(100);
		System.out.println(queue.remove());
		
		queue.insert(100);
		System.out.println(queue.remove());
	}
}

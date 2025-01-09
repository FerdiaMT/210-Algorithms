package _AlgorithmsFolder.scrapWork;

public class Scrap4 {
	public static void main(String[] args) {
		Queuee queue = new Queuee(10);
		
		queue.insert(10);
		queue.insert(5);
		queue.insert(2);
		queue.insert(18);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}
}

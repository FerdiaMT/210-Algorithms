package _AlgorithmsFolder.scrapWork;

import _AlgorithmsFolder._Stacks.Queue;

public class Scrap3 {
	public static void main(String[] args) {
		Queuee queue = new Queuee(10);
		
		queue.insert(10);
		queue.insert(5);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}
}

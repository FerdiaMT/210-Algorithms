package _AlgorithmsFolder.scrapWork;

public class PartC {
	public static void main(String[] args) {
		
		PartD pq = new PartD(20);
		
		pq.insert(5);
		pq.insert(100);
		pq.insert(15);
		pq.insert(2);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}
}

package _AlgorithmsFolder.scrapWork;

public class PartE {
	public static void main(String[] args) {
		 LL ll = new LL();
		 
		 ll.insert(5);
		 ll.insert(8);
		 ll.insert(12);
		 ll.remove();
		 ll.insert(15);
		 
		 while(!ll.isEmpty()) {
			System.out.println( ll.remove());
		 }
		 
		 
	}
}

package _AlgorithmsFolder.scrapWork;

public class LL {

	public Lnk current;
	
	public LL() {
		current = null;
	}
	
	public void insert(int data) {
		Lnk newLink = new Lnk(data);
		newLink.next = current;
		current = newLink;
	}
	
	public int remove() {
		if(isEmpty()) {
			return (Integer)null;
		}
		
		int temp = current.data;
		current = current.next;
		
		return temp;
	}
	

	
	public boolean isEmpty() {
		return current==null;
	}
	
	
	
	
}

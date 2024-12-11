package _AlgorithmsFolder._Stacks;

public class LinkedList {

	Link first = null;
	
	public void insertHead(int dataIn) {
		Link newLink = new Link(dataIn);
		newLink.next = first;
		first = newLink;
	}
	
	public void insertSorted(int dataIn) {
		Link newLink = new Link(dataIn);
		Link current;
		
		if(first==null || first.data>= newLink.data) {
			newLink.next = first;
			first = newLink;
		}else {
			current = first;
			while(current.next != null &&newLink.data > current.next.data ) {
				current = current.next;
			}
			newLink.next = current.next;
			current.next = newLink;
			
		}
	}
	
	public void display() {
		Link current = first;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public Link deleteHead() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}

package _AlgorithmsFolder._Stacks;

public class LinkedList {

	Link first = null;
	
	public void insertHead(int dataIn) {
		Link newLink = new Link(dataIn);
		newLink.next = first;
		first = newLink;
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

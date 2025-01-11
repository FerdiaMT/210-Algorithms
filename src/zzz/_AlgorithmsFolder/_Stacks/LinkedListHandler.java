package zzz._AlgorithmsFolder._Stacks;

public class LinkedListHandler {

	public static void main(String[] args) {	
		
		LinkedList linkedList = new LinkedList();
		//linkedList.insertHead(5);
		//linkedList.insertHead(10);
		///linkedList.insertHead(15);
		
		linkedList.insertSorted(5);
		linkedList.insertSorted(13);
		linkedList.insertSorted(2);
		linkedList.insertSorted(7);
		linkedList.insertSorted(1);
		
		linkedList.display();
	}
}

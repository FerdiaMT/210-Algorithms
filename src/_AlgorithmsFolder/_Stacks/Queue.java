package _AlgorithmsFolder._Stacks;

public class Queue {
	
	private int array[];
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	
	
	public Queue(int size) {
		maxSize = size;
		array = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public boolean insert(int input) { // boolean, will return false if it cant
		
		if(isFull()) {
			return false;
		}
		
		
		if(rear == maxSize-1) { // if rear pointer (insert pointer) has reached the top array
			rear=-1; //set rear to the bottom
		}
		rear++;
		array[rear] = input;
		nItems++;
		return true;
	}
	
	public int remove() {

		if(isFull()){
			return (Integer) null;
		}
		
		int temp = array[front]; // the temp will store the current fronbt value;
		if(front == maxSize-1) {
			front = -1; // set front to -1+1 which will be 0
		}
		front++;
		nItems--;
		return temp;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
}

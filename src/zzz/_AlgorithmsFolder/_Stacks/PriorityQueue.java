package zzz._AlgorithmsFolder._Stacks;

public class PriorityQueue {

	private int[] array;
	private int maxSize;
	private int nItems;
	private int front;
	private int rear;

	
	public PriorityQueue(int size) {
		maxSize = size;
		array = new int[maxSize];
		nItems = 0;
		front = 0;
		rear = -1;
	}
	
	public void insert(int input) {

		if(nItems ==0) { // if empty, make array 0 the input;
			array[0] = input; // an array of 1 is sorted
		}else {
			int j = nItems; // j is acting as a pointer that starts from the current amount of items
			
			while(j>0 && array[j-1] > input) { // while j is bigger than 0 and  the value below is bigger then our input
				array[j] = array[j-1];
				j--;
			}
			
			array[j] = input;
		}
		
		
		nItems++;
		
	}
	
	public int remove() {
		if(isFull())	return (Integer) null;
		
		int temp = array[front];
		if(front == maxSize-1) {
			front = -1;
		}
		front++;
		return temp;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
}

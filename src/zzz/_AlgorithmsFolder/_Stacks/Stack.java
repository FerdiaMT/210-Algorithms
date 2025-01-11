  package zzz._AlgorithmsFolder._Stacks;

public class Stack {

	private int maxSize;
	private int[] array;
	private int top;
	
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		array = new int[this.maxSize];
		top = -1;
	}
	
	//push , pop , peek
	public void push(int input) {
		top++;
		array[top] = input;
	}
	
	public int pop() {
		return array[top--];
	}
	
	public int peek() {
		return array[top];
	}
	
	// ==============
	// 	THE BOOLEANS 
	// 		
	//	  isFull
	//	  isEmpty
	//	 makeEmpty
	//
	// ==============
	
	public boolean isFull() { // pointer is at top of array, since array maxSize makes indexes all the way up to maxSize-1, we compare to maxSize -1
		return top==maxSize-1;
	}
	
	public boolean isEmpty() {//pointers at -1, since 0 is the first index;
		return top==-1;
	}
	
	public void makeEmpty() {
		top=-1;
	}
	
	
	
	
	
	
	
}

package _AlgorithmsFolder.scrapWork;

public class Stack8 {

	int maxSize;
	int top;
	int[] arr;
	
	public Stack8(int input) {
		maxSize = input;
		arr = new int[maxSize];
		int top = -1;
	}
	
	public boolean insert(int input) {
		//
		if(isFull()) {
			return false;
		}else {
			top++;
			
			arr[top]=input;
			
			return true;
		}
		
	}
	
	public int pop() {
		if(isEmpty()) {
			return (Integer)null;
		}
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top ==maxSize-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
}

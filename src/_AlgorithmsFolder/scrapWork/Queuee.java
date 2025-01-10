package _AlgorithmsFolder.scrapWork;

public class Queuee {
	//ok so were gonna write this up
	
	public int arr[];
	public int maxSize;
	public int front;
	public int back;
	public int nItems;
	
	public Queuee(int size) {
		
		maxSize = size;
		arr = new int[maxSize];
		front = 0;
		back=-1;
		nItems = 0;
		
	}
	
	public boolean insert(int input) {
		if(isFull()) {
			return false;
		}
		back++;
		if(back==maxSize) {
			back=0;
		}
		arr[back] = input;
		nItems++;
		return true;
	}
	
	public int remove() {
		if(isEmpty()) {
			return (Integer) null;
		}
		
		int temp = arr[front];
		
		front++;
		if(front==maxSize) {
			front=0;
		}
		nItems--;
		return temp;
		
	}
	
	public boolean isFull() {
		return nItems==maxSize;
	}
	
	public boolean isEmpty() {
		return nItems ==0;
	}
	
	
	
}
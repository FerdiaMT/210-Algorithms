package _AlgorithmsFolder.scrapWork;

public class PartD {
	
	public int arr[];
	public int maxSize;
	public int nItems;
	
	
	public PartD(int size) {
		maxSize = size;
		arr = new int[maxSize];
		nItems =0;
	}
	
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		if(isEmpty()) {
			arr[0]=data;
			nItems++;
			return true;
		}
		// insertion sort method
		
		// inserting a piece of data into an array
		
		int j = nItems-1;
		while(j>=0 && arr[j]>data) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=data;
		nItems++;
		return true;
	}
	
	public int remove() {
		if(isEmpty()) {
			return -10000000;
		}
		int temp = arr[0];
		
		for(int i = 0;i < nItems-1; i++) {
			arr[i]=arr[i+1];
		}
		
		nItems--;
		return temp;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public boolean isEmpty() {
		return nItems==0;
	}
	
}

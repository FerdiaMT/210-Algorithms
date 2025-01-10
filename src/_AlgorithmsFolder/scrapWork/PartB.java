package _AlgorithmsFolder.scrapWork;

public class PartB {

	public int arr[];
	public int maxSize;
	public int nItems;
	public int front;
	public int back;
	
	public PartB(int size) {
		maxSize = size;
		arr = new int[maxSize];
		nItems =0;
		front =0;
		back=-1;
	}
	
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		if(nItems==0) {
			arr[0]=data;
			return true;
		}
		int j = nItems;
		while(j>0 && arr[j-1]>data) {
			arr[j] = arr[j-1];
			j--;
		}
		arr[j] = data;
		
		nItems++;
		return true;
		
	}
	
	public int remove() {
		int temp = arr[0];
		
		//move everything down 1
		for(int i = 0 ; i < nItems; i++) {
			arr[i]=arr[i+1];
		}
		nItems--;
		
		return temp;
	}
	
	public boolean isFull() {
		return nItems ==maxSize;
	}
	
	public boolean isEmpty() {
		return nItems ==0;
	}
}

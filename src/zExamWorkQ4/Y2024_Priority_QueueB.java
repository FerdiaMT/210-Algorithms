package zExamWorkQ4;

public class Y2024_Priority_QueueB {
	public int maxSize;
	public int arr[];
	public int nItems;
	
	public Y2024_Priority_QueueB(int length) {
		maxSize = length;
		arr = new int[maxSize];
		nItems = 0;
	}
	
	public void insert(int data) {

		if(nItems ==0) {
			arr[0] = data;
		}else {
			int pointer = nItems;
			while(pointer > 0 && arr[pointer-1]>data) {
				arr[pointer] = arr[pointer-1];
				pointer--;
			}
			arr[pointer] = data;
		}
		nItems++;
	}
	
	public int delete() {
		
		if(nItems ==0) {
			return (Integer) null;
		}else {
			
	        int temp = arr[0];
	        
	        // move everything one spot to the left, so array[1] is now 0 and therefore still sorted
	        for (int i = 0; i < nItems - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        nItems--;
	        return temp;
		}
	}
}

package labWorkNumbered;

public class Lab6_PriorityQueue {

	private int[] array;
	private int maxSize;
	private int nItems;


	
	public Lab6_PriorityQueue(int size) { // constructor
		maxSize = size;
		array = new int[maxSize];
		nItems = 0;
	}
	
	public void insert(int input) { // insert method
		
		if(nItems ==0) { // if empty, make array 0 the input;
			array[0] = input; // an array of 1 is sorted
		}else {
			int j = nItems; // j is acting as a pointer that starts from the current amount of items
			while(j>0 && comparison(array[j-1] , input) ) { // while j is bigger than 0 and  the value below is bigger then our input
				array[j] = array[j-1];
				j--;
			}
			array[j] = input;
		}
		nItems++;
	}
	
	
	
	//array[j-1] > input
	
	// im not sure what a comparison method is, so in this case i replaced the line while(j>0 && array[j-1] > input )
	
	public boolean comparison(int a , int b) {// not sure what this is asking ?
		if(a>b) {
			return true;
		}else {
			return false;
		}
	}
	
	public int remove() { // remove method
		if(isEmpty())	return (Integer) null;
		
        int temp = array[0];
        
        // move everything one spot to the left, so array[1] is now 0 and therefore still sorted
        for (int i = 0; i < nItems - 1; i++) {
            array[i] = array[i + 1];
        }
        nItems--;
        return temp;
	}
	
	public int peek() { // peek method
		return array[0];
	}
	
	
	public boolean isEmpty() {
		return nItems ==0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}

	
	public int size() {
	     return nItems;
	}
	

	  
}

/*
 Write a program that takes input from the user and places the input into a priority
queue.
The first integer entered by the student will define the size of the queue.
The user will input data to the Priority Queue
The Priority Queue will then be printed out.
Remember that the input will be sorted as it is inserted into the queue
To do this, you will need to create a Priority Queue class.
This class should contain:
• A constructor method
• An insert method
• A comparison method
• A remove method
• A peek method
• An isEmpty method
• An isFull method
• A size method
Sample input:
6
3
8
2
9
REMOVE
5
3
Sample Output:
3, 3, 5, 8, 9
 */


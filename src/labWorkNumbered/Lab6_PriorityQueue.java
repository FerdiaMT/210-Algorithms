package labWorkNumbered;

public class Lab6_PriorityQueue {
	
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	//standard array first in last out
	//priorityQueue
	
	public Lab6_PriorityQueue(int size) {
		
		maxSize = size;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(int item) { // insert item

		 if(nItems==0){ // if no items,
			 queueArray[0] = item; // insert at 0
		 }
		 else{ // if some items,
			 int j = nItems; // start at end

			 while(j > 0 && queueArray[j-1] > item){// while new item larger
				 queueArray[j] = queueArray[j-1]; // shift upward
				 j--; // decrement j
			 
			 }
		 	queueArray[j] = item; // insert it
		 }
		 	nItems++; // increase items
		}
	
	public int remove() {
		if(isEmpty()) {
			return -1 ;
		}
		int temp = queueArray[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public static void comparison() {
		
	}

	
	public static void peek() {
		
	}
	
	public  boolean isEmpty() {
		return front == -1;
	}
	
	public boolean isFull() {
		
		if(rear == (maxSize-1)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int size() {
		return -1;
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
5 8 1 5 7 3 Remove 2
Sample Output:
1 2 3 5 7
*/

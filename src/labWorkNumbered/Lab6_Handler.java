package labWorkNumbered;
import java.util.Scanner;
public class Lab6_Handler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of the queue");
		//int length = sc.nextInt();
		
		int length = 6; //THIS IS JUST EXAMPLE CODE WHERE INPUT IS 6
		
		Lab6_PriorityQueue pq = new Lab6_PriorityQueue(length);
		
		
		pq.insert(3);
		pq.insert(8);
		pq.insert(2);
		pq.insert(9);
		pq.remove();
		pq.insert(5);
		pq.insert(3);
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
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
package labWorkNumbered;
import java.util.Scanner;
public class Lab6_Handler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of the queue");
		int length = sc.nextInt();
		Lab6_PriorityQueue pq = new Lab6_PriorityQueue(length);
		pq.insert(5);
		pq.insert(10);
		pq.insert(20);
		pq.insert(7);
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
5 8 1 5 7 3 Remove 2
Sample Output:
1 2 3 5 7
*/
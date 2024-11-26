package labWorkNumbered;
import java.util.Scanner;
public class Lab6_Handler {
	
	
	public static void lab6Main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of the queue");
		int length = sc.nextInt();
		sc.nextLine();
		
		Lab6_PriorityQueue pq = new Lab6_PriorityQueue(length);
		
		System.out.println("Now taking input");
		String input = sc.nextLine();
		
		while(!input.equals("quit")) {
			
			modifyQueue(input, pq);
			input = sc.nextLine();
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of the queue");
		int length = sc.nextInt();
		sc.nextLine();
		
		Lab6_PriorityQueue pq = new Lab6_PriorityQueue(length);
		
		System.out.println("Now taking input");
		String input = sc.nextLine();
		
		while(!input.equals("quit")) {
			
			modifyQueue(input, pq);
			input = sc.nextLine();
			
		}
	}

	private static void modifyQueue(String input, Lab6_PriorityQueue pq) {
		if(  (!input.equals("REMOVE") && !input.equals("PRINT") &&  pq.isFull())) {
			System.out.println("QUEUE IS FULL, NOT TAKING INPUT");
		}else {
			if(input.equals("REMOVE")) {
				pq.remove();
			}
			else if(input.equals("PRINT")) {
				pq.printQueue();
			}else {
				pq.insert(Integer.parseInt(input));
				System.out.println(input+" has been inputed");
			}
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
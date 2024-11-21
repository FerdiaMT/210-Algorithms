package labWorkNumbered;

import java.util.Scanner;

public class Lab7_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Lab7_LinkedList linkedList = new Lab7_LinkedList();
		linkedList.insertHead("Steve",32,"ComputationalThinking",4);
		linkedList.insertHead("Larry",18,"ARTS",1);
		linkedList.insertHead("Bunny",26,"CSSE",2);

		
		String input = sc.nextLine();
		
		while(!input.equals("quit")) {
		
			if(input.equals("Name")) {
				linkedList.setFirstName(sc.nextLine());
			}
			if(input.equals("Age")) {
				linkedList.setFirstAge(sc.nextInt());
				sc.nextLine(); // i believe this will remove the enter key
			}
			if(input.equals("Degree")) {
				linkedList.setFirstDegree(sc.nextLine());
			}
			if(input.equals("yearOfStudy")) {
				linkedList.setFirstYearOfStudy(sc.nextInt());
				sc.nextLine();
			}
			if(input.equals("print")) {
				linkedList.display();
			}
			if(input.equals("remove")) {
				linkedList.deleteHead();
			}
			System.out.println("Running, taking input");
			input = sc.nextLine();
			
		}
		
	}
	
}

package labWorkNumbered;

import java.util.Scanner;

public class Lab5_DirectionStack {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Lab5_Stack stack = new Lab5_Stack(10); // initializes stack with size 10
		String input = "";
		do {
			input = sc.nextLine();
			stack.push(input);
		}
		while(input !="Arrived");
		
		System.out.println("A");
		
	}
}
	
	

//inputs 
//Go North
//Go South
//Go East
//Go West
//Go Back
//Arrived
package labWorkNumbered;

import java.util.Scanner;

public class Lab5_DirectionStack {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Lab5_Stack stack = new Lab5_Stack(10); // initializes stack with size 10
		String input = sc.nextLine();
		while(!input.equals("Arrived")){
			
			if(input.equals("Go Back")) {
				stack.pop();
			}else {
				stack.push(input);
			}
			
			input = sc.nextLine();

		}
		
		while(!stack.isEmpty()) {
			String output = stack.peek();
			
			switch(output) {
				
			case "Go North":
				output = "Go South";
				break;
			case "Go South":
				output = "Go North";
				break;
			case "Go East":
				output = "Go West";
				break;
			case "Go West":
				output = "Go East";
				break;
			default:
				output = output+" was an input error";
			}
			
			System.out.println(output);
			stack.pop();
		}
		
	}
}
	
	

//inputs 
//Go North
//Go South
//Go East
//Go West
//Go Back
//Arrived
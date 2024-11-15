package labWorkNumbered;

import java.util.Scanner;

public class Lab5_DirectionStack {
	
//	public static void lab5Main() {
//		run();
//	}
	
public static void main(String args[]) {
		
		
Scanner sc = new Scanner(System.in);
		
		
		Lab5_Stack stack = new Lab5_Stack(10); // initializes stack with size 10
		Lab5_Stack stack2 = new Lab5_Stack(10);
		
		Lab5_Stack stack3 = new Lab5_Stack(10); // initializes stack with size 10

		
		String input = sc.nextLine();
		while(!input.equals("Arrived")){
			
			if(input.equals("Go Back")) {
				stack.pop();
				stack2.popFirst();
				stack3.pop();
			}else {
				stack.push(input);
				stack2.push(input);
				stack3.push(input);
			}
			
			input = sc.nextLine();

		}
		
		boolean palindrome = true;
		while(!stack.isEmpty()) {
			if(   !stack.peek().equals(stack2.peekFirst())) {
				System.out.println("Instructions are not a palindrome");
				System.out.println(stack.peek() +  " is not equal to " + stack.peekFirst());
				palindrome = false;
				break;
			}else {
				stack.pop();
				stack2.popFirst();
			}
		}
		
		if(palindrome) {
			System.out.println("The instructions are a palindrome");
		}
		
		
		
		int counter = 0;
		
		while(!stack3.isEmpty()) {
			String output = stack3.peek();
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


			//stack1Output[counter] = output;
			//counter++;
			System.out.println(output);
			stack3.pop();
		}
		
	}
	
}
	
		// TODO Auto-generated method stub
		

		
	
	

//inputs 
//Go North
//Go South
//Go East
//Go West
//Go Back
//Arrived
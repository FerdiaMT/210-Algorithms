//package labWorkNumbered;
//import java.util.Scanner;
//public class LabMaster {
//
//	public static String[] Names = {
//			"---------",
//			"Luhns Algorithm",  		//W1
//			"Collatz Conjecture",		//W2
//			"nthPrime",					//W3
//			"sortingWords",				//W4
//			"DirectionStack",			//W5
//			"PriorityQueue"	,			//W6
//			"LinkedListW7",				//W7
//			"LinkedListw8"				//W8
//	};
//	
//	//COMMENT THIS LINE OUT WHEN WORKING ON A NEW LAB QUESTION
//	//------------------------------------------------------------
//
//	//public static void main(String[] args) {runProgram();}
//	
//	//------------------------------------------------------------
//	
//	public static void runProgram(){
//		printCode1();//prints the first block of code
//		
//		int input = takeInput(); // takes the input
//
//		printCode2(input); // prints the second block of code
//		
//		runProgram(input); // runs the selected program
//	}
//	
//	public static void printCode1() {
//		System.out.println("Input which week you want \n"+"\n- - - - - - - - - - - - -  \n");
//		for(int i = 1 ; i <Names.length ; i++) {
//			System.out.println("Week: "+i+", "+Names[i]);
//		}
//		System.out.println("\n- - - - - - - - - - - - -  \n");
//		System.out.println("Input just the number");
//	}
//	//--
//	public static int takeInput() {
//		//user must not input 0, 4+, or a string
//		boolean run = false;
//		String inputString = "";
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(run !=true) {
//			inputString = sc.nextLine();
//			if(
//					inputString.equals("1")||
//					inputString.equals("2")||
//					inputString.equals("3")||
//					inputString.equals("4")||
//					inputString.equals("5")
//			) {
//				run=true;
//				
//			}else {
//				System.out.println("Wrong input, put an int from 1 to "+ (Names.length-1));
//			}
//		}
//		return(Integer.valueOf(inputString));
//	}
//	
//	public static void printCode2(int input) {
//		System.out.println("You have selected: "+ Names[input]+" from week " + input);
//		System.out.println("\n- - - - - - - - - - - - -  \n");
//	}
//	public static void runProgram(int input) {
//		if(input==1) {
//			Lab1_luhnsAlgorithm.lab1Main();
//
//		}else if(input==2) {
//			Lab2_collatz.lab2Main();
//		}else if(input==3) {
//			Lab3_nthPrime.lab3Main();
//		}else if(input==4) {
//			Lab4_SortingWords.lab4Main();
//		}else if(input==5) {
//			Lab5_DirectionStack.lab5Main();
//		}else if(input==6) {
//			Lab6_Handler.lab6Main();
//		}else if(input==7) {
//			Lab7_Main.lab7Main();
//		}else if(input==8) {
//			Lab8_Main.lab8Main();
//		}
//		
//	}
//}

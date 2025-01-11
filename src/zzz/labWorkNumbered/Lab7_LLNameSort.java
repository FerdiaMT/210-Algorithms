package labWorkNumbered;

import java.util.Scanner;

public class Lab7_LLNameSort {
	
	public static void lab7Main() {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Lab7_LinkedList linkedList = new Lab7_LinkedList();
		linkedList.insertHead("Steve","32","ComputationalThinking","4");
		linkedList.insertHead("Larry","18","ARTS","1");
		linkedList.insertHead("Bunny","26","CSSE","2");

		
		String input = sc.nextLine();
		
		
		Lab7_Link selected = new Lab7_Link("NULL","NULL","NULL","NULL");
		while(!input.equals("quit")) {
			
			if(input.equals("Name")) {
				selected = linkedList.search("Name" , sc.nextLine());
			}
			if(input.equals("Age")) {
				selected = linkedList.search("Age" , sc.nextLine());
			}
			if(input.equals("Degree")) {
				selected = linkedList.search("Degree" , sc.nextLine());
			}
			if(input.equals("yearOfStudy")) {
				selected = linkedList.search("yearOfStudy" , sc.nextLine());
			}
			if(input.equals("Print List")) {
				linkedList.display();
			}
			if(input.equals("print")) {
				selected.displayLink();
			}
			if(input.equals("Remove")) {
				linkedList.deleteSelectedLink(selected);
			}
			if(input.equals("New Link")) {
				String a = sc.nextLine();
				String b = sc.nextLine();
				String c = sc.nextLine();
				String d = sc.nextLine();
				linkedList.insertHead(a,b,c,d);
			}
			//System.out.println("Running, taking input");
			input = sc.nextLine();
		}
		
	}
	
}

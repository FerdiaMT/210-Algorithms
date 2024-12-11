package labWorkNumbered;
import java.util.Scanner;
public class Lab8_BrokenLinkedList {

	public static void main(String[] args) {
		Lab8_LinkedList ll = new Lab8_LinkedList();
		ll.insertHead(3);
		ll.insertHead(2);
		ll.insertHead(1);
		
		
		ll.makeLoop(3,2);
		
		ll.findLoop();
		
		//if link goes to previous link, cause an error
		
		//ll.navigateList(20);
	}
}


// if its linking back to the link previous, link it to the first
// check if its gone back to first so itl print out the entire list

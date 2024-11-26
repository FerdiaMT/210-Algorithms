package labWorkNumbered;
import java.util.Scanner;
public class Lab8_Main {

	public static void main(String[] args) {
		Lab8_LinkedList ll = new Lab8_LinkedList();
		ll.insertHead(1);
		ll.insertHead(2);
		ll.insertHead(3);
		ll.insertHead(4);
		ll.insertHead(5);
		ll.insertHead(6);
		
		ll.makeLoop(2,6);
		
		ll.navigateList(20);
	}
}

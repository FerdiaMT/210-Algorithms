package labWorkNumbered;

public class Lab8_LinkedList {
	
	private Lab8_Link first;
	
	public Lab8_LinkedList() {
		first = null;
	}
	
	public void insertHead(int data) {
		Lab8_Link newLink = new Lab8_Link(data);
		newLink.next = first;
		first = newLink;
	}
	
	public Lab8_Link delete() {
		Lab8_Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void makeLoop(int from, int to) {
		//int from.next will point to int to
		
		Lab8_Link currentA = first;
		while(currentA.data != from) {
			currentA = currentA.next;
		}
		
		Lab8_Link currentB = first;
		while(currentB.data != to) {
			currentB = currentB.next;
		}
		
		//currentA is from, currentB is too
		currentA.next = currentB;
		System.out.println(currentA.data + " now links to "+ currentB.data);
		//at this point current is the from
	}
	
	public void navigateList(int count) {
		Lab8_Link current = first;
		for(int i = 0; i < count; i++) {
			System.out.print(current.data);
			current = current.next;
			System.out.println(" goes to "+ current.data);
		}
	}
	
}

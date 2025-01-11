package labWorkNumbered;

public class Lab8_LinkedList {
	
	private Lab8_Link first;
	//private Lab8_Link last;
	
	
	public Lab8_LinkedList() {
		first = null;
		//previous = null;
	}
	
	public boolean isEmpty() {

		return (first==null);
	}
	
	
	
	public void insertHead(int input) {
		if(isEmpty()) {
			Lab8_Link newLink = new Lab8_Link(input);
			first = newLink;
			//System.out.println(input + "is now first");
			
		}else {
			Lab8_Link newLink = new Lab8_Link(input);
			
			Lab8_Link current = first;
			Lab8_Link previous = first;

			//System.out.println(current.data + "is the current datA");
			while(newLink.data >current.data ) {
				previous = current;
				current = current.next;
				
				
			}

			
			if(current == first) {
				newLink.next=current;
				first = newLink;
			}else {
				   previous.next = newLink;
				   newLink.next = current;
			}
		}
		
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
	
	public void navigateList(int count){
		Lab8_Link current = first;
		for(int i = 0; i < count; i++){
			System.out.print(current.data);
			current = current.next;
			System.out.println(" goes to "+ current.data);
		}
	}

	public void makeInfLoop() {
		
		Lab8_Link last = first;
		while(last.next !=null) {
			last = last.next;
		}
		last.next = first;
	}

	public int detectInfLoopInt() {
		Lab8_Link last = first;
		while(last.next !=first) {
			last = last.next;
		}
		return last.data;
	}

	public void printInfLoop() {
		Lab8_Link last = first;
		while(last.next !=first) {
			last = last.next;
		}
		System.out.println(last.data); 
	}

	public void findLoop() {
		//if the current link is going to the one previous, cause current to go to first
		
		Lab8_Link lastLink = first;
		Lab8_Link current = first.next;
		while(current.next !=lastLink) {
			current = current.next;
			lastLink = lastLink.next;
		}
		
		current.next = first;
		//System.out.println(current.data+ "is the error"); 
		Lab8_Link pointer = first;
		while(pointer.next !=first) {
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
		System.out.println(pointer.data);
		
	}
}

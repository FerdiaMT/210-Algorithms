package labWorkNumbered;

public class Lab7_LinkedList {

	private Lab7_Link first; // this is a pointer of current basically
	
	public Lab7_LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertHead(String name, int age, String degree, int yearOfStudy) {
		Lab7_Link newLink = new Lab7_Link( name,  age,  degree, yearOfStudy);
		newLink.next = first;
		first = newLink;
	}
	
	public Lab7_Link deleteHead() {
		Lab7_Link temp = first;// make a copy
		first = first.next;// move pointer right one
		return temp;// return our copy
	}
	
	public Lab7_Link delete(String key) {
		Lab7_Link current = first;
		Lab7_Link previous = first;
		
		while(!current.name.equals(key) ) {
			if(current.next ==null) {
				return null;//end of list
			}else {
				previous = current;
				current = current.next;
			}
		}
		// at this point it has been found
		
		if(current == first) {// if data is first one
			first = first.next;// move the pointer
			// this is the easy option
			
		}else {
			previous.next = current.next;
		}
		
		return current;
	}
	
	public void display() {
		Lab7_Link current = first;//create a copy of pointer
		while(current!=null) {
			current.displayLink();
			current = current.next;
		}
	}
}

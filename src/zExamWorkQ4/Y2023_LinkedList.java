package zExamWorkQ4;

public class Y2023_LinkedList {

	Y2023_Link first;
	
	Y2023_LinkedList(){
		first  = null;
	}

	public void insertHead(String a, int b) {
		Y2023_Link newLink = new Y2023_Link(a,b);
		newLink.next = first;
		first = newLink;
	}
	
	public boolean isEmpty() {
		return first.next == null;
	}
	
	public void insertSorted(String a ,int b) {
		Y2023_Link newLink = new Y2023_Link(a,b);

		if(isEmpty()) {
			newLink = first;
		}else {
			
			Y2023_Link current = first;
			Y2023_Link previous = first;
			
			while(newLink.score > current.score && current.next!=null) {
				previous = current;
				current = current.next;
			}
			previous.next = newLink;
			newLink.next = current;
			//so this value goes between the 2
		}
		
		
	}
	
	public int delete() {
	
		//whatevers currently first will no longer be first
		int temp = first.score;
		first = first.next;
		
		return temp;
	}
	
	
}

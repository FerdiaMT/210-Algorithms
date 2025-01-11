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

		Y2023_Link current;
		
		if(first==null ||first.score>newLink.score 
				||(first.score==newLink.score&&newLink.name.compareTo(first.name)<0)) {
			newLink.next = first;
			first = newLink;
		}else {
			current = first;
			while(current.next != null && (newLink.score > current.next.score 
					||newLink.score == current.next.score && newLink.name.compareTo(current.name)>0 ) ) {
				current = current.next;
			}
			//once it breaks,, its because newLink is bigger than current but smaller then current.next
			newLink.next = current.next;
			current.next = newLink;
		}
		
		
		
		
		
	}
	
	public void delete() {
	
		//whatevers currently first will no longer be first
		int temp = first.score;
		String tempString = first.name;
		first = first.next;
		
		System.out.println(tempString + " , "+temp);
	}
	
	
}

package labWorkNumbered;

public class Lab8_Link {
	
	Lab8_Link next;
	int data;
	
	public Lab8_Link(int data) {
		this.data = data;
		this.next=null;
	}
	
	public void displayLink() {
		System.out.println("Data is "+ data);
	}
	
}

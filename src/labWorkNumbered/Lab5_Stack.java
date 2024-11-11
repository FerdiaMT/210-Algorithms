package labWorkNumbered;

public class Lab5_Stack {

	private int maxSize; // size of stack array
	private String[] stackArray;
	private int top; // top of stack
	 
	 
	public Lab5_Stack(int n) {
		
		maxSize = n; // set array size
		stackArray = new String[maxSize]; // create array
		top = -1; 
	}
	
	public void push(String j) {
		top++;
		stackArray[top] = j;
		// increment top, insert item
	}
	
	public String pop() {
		return stackArray[top--];
		//access item, decrement top
	} 
	
	public String peek() {

		return stackArray[top];
	} 
	
	public boolean isEmpty() {

		return (top == -1);
	} 
	
	
	
}

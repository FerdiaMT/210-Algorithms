package zzz._AlgorithmsFolder._Stacks;

public class StackHandler {
	public static void main(String[] args) {
		int stackSize = 10;
		Stack stack = new Stack(stackSize);
		stack.push(10);
		stack.push(11);
		stack.push(7);
		stack.push(10);
		stack.push(5);
		
		
		while(stack.isEmpty()==false) {
			System.out.println(stack.pop());
		}
	}
}

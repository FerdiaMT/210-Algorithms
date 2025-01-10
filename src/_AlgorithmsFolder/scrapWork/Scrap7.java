package _AlgorithmsFolder.scrapWork;

public class Scrap7 {
	public static void main(String[] args) {
		int size = 10;
		Stack8 stack = new Stack8(size);
		
		stack.insert(5);
		stack.insert(12);
		stack.insert(20);
		stack.insert(33);
		
		while(stack.isEmpty()==false) {
			System.out.println(stack.pop());
		}
		
		
	}
}

package zExamWorkQ4;

public class Y2023_nStudents {
	public static void main(String[] args) {
		int length = 3;
		
		Y2023_LinkedList ll = new Y2023_LinkedList();
		
		ll.insertHead("John O’Brien",42);
		ll.insertHead("Emily Smith" ,59);
		ll.insertHead("Kate Murphy" ,42);
		
		System.out.println(ll.delete());
		System.out.println(ll.delete());
		System.out.println(ll.delete());
	}
}

package zExamWorkQ4;

public class Y2023_nStudents {
	public static void main(String[] args) {
		int length = 3;
		
		Y2023_LinkedList ll = new Y2023_LinkedList();
		
		ll.insertSorted("Kohn O’Brien",42);
		ll.insertSorted("Emily Smith" ,59);
		ll.insertSorted("Jate Murphy" ,42);
		
		ll.delete();
		ll.delete();
		ll.delete();
	}
}

package zExamWorkQ4;

public class Y2024_Priority_QueueA {
	public static void main(String[] args) {
		
		int length = 5;
		Y2024_Priority_QueueB pq = new Y2024_Priority_QueueB(5);
		pq.insert(5);
		pq.insert(199);
		pq.insert(1);
		pq.insert(3);
		
		System.out.println(pq.delete());
		System.out.println(pq.delete());
	}
	
}

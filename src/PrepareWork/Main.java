package PrepareWork;

public class Main {

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		graph.addNode('A');
		graph.addNode('B');
		graph.addNode('C');
		graph.addNode('D');
		graph.addNode('E');
		
		graph.addPath(0, 1);
		graph.addPath(4, 3);
		graph.addPath(2, 3);
		
		graph.print();
		
	}
}

package PrepareWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
	
	int size;
	int matrix[][];
	ArrayList<Node>nodeList = new ArrayList<>();
	
	public Graph(int size) {
		this.size = size;
		matrix = new int[size][size];
	}
	
	public void addNode(char input) {
		Node node = new Node(input);
		nodeList.add(node);
	}
	
	public void addPath(int r, int c) {
		matrix[r][c]=1;
	}
	
	public boolean checkPath(int r, int c) {
		return matrix[r][c]==1;
	}
	
	public void depthFirstSearch(int beginIndex) {
		boolean[] visited = new boolean[size];
		dfsHelper(beginIndex,visited);
	}
	
	public void dfsHelper(int beginIndex, boolean[] visited) {
		
		if(visited[beginIndex]) {
			return;
		}else {
			visited[beginIndex]=true;
		}
		for(int i = 0 ; i < matrix[beginIndex].length;i++) {
			if(matrix[beginIndex][i]==1) {
				dfsHelper(i,visited);
			}
		}
		return;
	}
	
	public void print() {
		
		for(int i = 0 ; i < matrix.length;i++) {
			for(int j = 0 ; j < matrix.length;j++) {
				System.out.print(matrix[i][j]);
			}
			
			System.out.println();
		}
	}
}

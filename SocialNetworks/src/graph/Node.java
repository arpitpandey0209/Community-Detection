package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int nodeLabel;
	private List<Edge> adjList;
	
	public Node(int nodeLabel) {
		this.nodeLabel = nodeLabel;
		adjList = new ArrayList<>();
	}
	
	public int getLabel() {
		return nodeLabel;
	}
	
	public List<Edge> getAdjList() {
		return adjList;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.nodeLabel == ((Node) obj).nodeLabel;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 31 + this.nodeLabel + this.adjList.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nodeLabel + "";
	}
	
}

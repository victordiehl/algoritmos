package workson;

public class Node {
	private String element;
	private Node next;
	
	public Node(String element) {
		this.element = element;
		next = null;
	}
	
	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public String toString() {
		return "node [value=" + element + ", next=" + next + "]";
	}
}

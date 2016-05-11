package workson;

public class Pilha {
	private Node head;
	private int count;	


	public Pilha(){
		head = null;
		count = 0;
	}
	
	public void push(String value) {
		Node n = new Node(value);
		n.setNext(head);
		head = n;
		count++;						
	}
	
	public void pop() {
		Node aux = head;
		head = head.getNext();
		count --;		
	}
	
	public int size(){
		return count;
	}
	
	public String top(){
		return head.getElement();
	}
	
}

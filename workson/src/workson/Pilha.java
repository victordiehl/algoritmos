package workson;

public class Pilha {
	private Node head;
	private int count;	
	private int max;


	public Pilha(){
		head = null;
		count = 0;
		max = 0;
	}
	
	public void push(String value) {
		Node n = new Node(value);
		n.setNext(head);
		head = n;
		count++;
		if(count > max)
			max = count;
	}
	
	public int max(){
		return max;
	}
	
	public String pop() {
		Node aux = head;
		head = head.getNext();
		count --;
		return aux.getElement();
	}
	
	public int size(){
		return count;
	}
		
	
	public String top(){
		return head.getElement();
	}
	
	public void clear(){
		count = 0;
		head = null;
	}
	
	public boolean isEmpty(){
		return count == 0;
	}
			
}

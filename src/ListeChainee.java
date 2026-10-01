
public class ListeChainee {

	private Node head;
	private Integer size;
	
	private static class Node {
		private Integer value;
		private Node next;
		
		public Node(Integer value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public Integer getValue() {
			return this.value;
		}
		
		public Node getNext() {
			return this.next;
		}
		
		public void setValue(Integer value) {
			this.value = value;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	
	public ListeChainee(Integer headValue) {
		this.head = new Node(headValue,null);
		this.size = 1;
	}

	public Integer size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public Integer first() {
		if(isEmpty()) return null;
		return head.getValue();
	}
	
	public Integer last() {
		if(isEmpty()) return null;
		Node currentNode = head;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getValue();
	}
	
	public void addFirst(Integer value) {
		Node newHead = new Node(value,this.head);
		this.head = newHead;
		size++;
	}
	
	public void addLast(Integer value) {
		if(isEmpty()) {
			head = new Node(value,null);
			size++;
			return;
		}
		Node currentNode = head;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(new Node(value,null));
		size++;
	}
	
	public Integer removeFirst() {
		if(isEmpty()) return null;
		size--;
		Integer value = first();
		this.head = this.head.getNext();
		return value;
	}
	
	public String toString() {
		String res = "";
		Node currentNode = head;
		while(currentNode.getNext() != null) {
			res += currentNode.getValue() + " -> ";
			currentNode = currentNode.getNext();
		}
		return res + currentNode.getValue();
	}
	
	///// 2.
	
	public Integer penultimate() {
		if(isEmpty()) return null;
		Node currentNode = head;
		while(currentNode.getNext().getNext() != null) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getValue();
	}
	
	public ListeChainee inverser() {
		if(isEmpty()) return null;
		
		Node currentNode = head;
		ListeChainee inverse = new ListeChainee(currentNode.getValue());
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			inverse.addFirst(currentNode.getValue());
		}
		return inverse;
	}
	
	public void echanger() {
		//TODO
	}
}

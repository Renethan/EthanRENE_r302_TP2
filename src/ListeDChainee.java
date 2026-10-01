
public class ListeDChainee {

	private Node head, tail;
	private Integer size;
	
	
	private static class Node{
		private Integer value;
		private Node next;
		private Node prev;
		
		public Node(Node prev,Integer value, Node next) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		
		public Integer getValue() {
			return this.value;
		}
		
		public Node getNext() {
			return this.next;
		}
		
		public Node getPrev() {
			return this.prev;
		}
		
		public void setValue(Integer value) {
			this.value = value;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		
		public String toString() {
			return String.valueOf(value);
		}
		
	}
	
	public ListeDChainee(Integer headValue) {
		this.head = new Node(null,headValue,null);
		this.tail = head;
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
		Node newHead = new Node(null,value,this.head);
		this.head.setPrev(newHead);
		this.head = newHead;
		size++;
	}
	
	public void addLast(Integer value) {
		Node newTail = new Node(this.tail,value,null);
		this.tail.setNext(newTail);
		this.tail = newTail;
		size++;
	}
	
	public Integer removeFirst() {
		if(isEmpty()) return null;
		size--;
		Integer value = first();
		if(this.head.getNext() != null) {
			this.head = this.head.getNext();
		} else {
			this.head = null;
			this.tail = null;
		}
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
}

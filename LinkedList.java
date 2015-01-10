class Node<T>{
	T data;
	Node next;
	Node prev;
	Node(T data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	Node(){
		this.data = null;
		this.next = null;
		this.prev = null;
	}
}

public class LinkedList<T>{
	Node head;
	Node tail;

	public <T> LinkedList(T data){
		this.head = new Node(data);
		this.tail = this.head;
	}
	public <T> LinkedList(){
		this.head = new Node();
		this.tail = this.head;
	}

	public <T> void add(T data){
		if(this.head == null){
			this.head = new Node(data);
			this.tail = this.head;
		}else if(){
			Node new_node = new Node(data);
			new_node = this.tail.next;
			this.tail = new_node;
		}
	}

	public String toString(){
		Node cur = this.head;
		String str = "";
		while(cur.next != null){
			str += cur.data;
			cur = cur.next;
		}
		return str;
	}

}
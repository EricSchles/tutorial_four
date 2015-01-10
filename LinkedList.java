class Node<T>{
	T data;
	Node next;
	<T> Node(T data){
		this.data = data;
		this.next = null;
	}
	Node(){
		this.data = null;
		this.next = null;
	}
}

public LinkedList<T>{
	Node head;
	Node tail;

	public <T> LinkedList(T data){
		this.head = new Node(data);
		this.tail = this.head;
	}
}
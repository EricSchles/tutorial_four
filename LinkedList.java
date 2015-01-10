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
	public Node head;
	public Node tail;

	public static <T> void print(T input){
		System.out.println(input);
	}
	public <T> LinkedList(T data){
		this.head = new Node(data);
		this.tail = this.head;
	}
	public <T> LinkedList(){
		this.head = new Node();
		this.tail = this.head;
	}

	public <T> void add(T data){
		if(this.head.data == null){
			this.head = new Node(data);
			this.tail = this.head;
		}else if(this.head == this.tail){
			this.tail = new Node(data);
			this.head.next = this.tail; 
		}else{
			Node new_node = new Node(data);
			new_node = this.tail.next;
			this.tail = new_node;
		}
	}

	public <T> T remove(T data){
		Node cur = this.head;
		while(cur != null){
			if(cur.data == data){
				return data;
			}
		}
	}
	public String toString(){
		Node cur = this.head;
		String str = "";
		while(cur.next != null){
			str += " "+cur.data;
			cur = cur.next;
		} 
		str += " "+cur.data;
		return str;
	}

}
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
			this.tail.prev = null;
			this.head.prev = null;
		}else if(this.head == this.tail){
			this.tail = new Node(data);
			this.head.next = this.tail;
			this.tail.prev = this.head;
			this.head.prev = null;
		}else{
			Node new_node = new Node(data);
			new_node = this.tail.next;
			new_node.prev = this.tail;
			this.tail = new_node;
		}
	}


	public <T> void remove(T data){
		Node cur = this.head;
		while(cur != null){
			if(cur.data == this.head.data){ 
			//the check is good enough because we are at the front of
			//our list.
				if(cur.next != null){
					this.head = cur.next;
					cur.next = null;
					cur.prev = null; //being unnecessarily careful
					cur = null;
				}
			}else if(cur == this.tail){
				 if(cur.data == this.tail.data){
					this.tail = cur.prev;
					this.tail.next = null;
					cur.prev = null;
					cur.next = null; //being unnecessarily careful
					cur = null;
				}
			} else if(cur.data == data){
				Node prev_node = cur.prev;
				Node next_node = cur.next;
				prev_node.next = next_node;
				next_node.prev = prev_node;
				cur.next = null;
				cur.prev = null;
				cur = null;
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
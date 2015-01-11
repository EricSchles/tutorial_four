class Main{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.add(5);
		ll.add(7);
		print(ll.toString());
		//Linked List tested
		//ll.remove(5);
		ll.pop();
		print(ll.toString());
		ll.pop();
		print(ll.toString());
		ll.pop();
		print(ll.toString());

		Stack s = new Stack();
		s.add(4);
		s.add(17);
		print(s.toString());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		print(s.toString());
	}
}
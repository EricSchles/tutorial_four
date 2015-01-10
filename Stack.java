public class Stack<T>{
	LinkedList LL;
	public <T> Stack(T data){
		LL = new LinkedList(data);
	}

	public T get(){
		return LL.tail.data;
	}
} 
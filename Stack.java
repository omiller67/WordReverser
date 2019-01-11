
import java.util.NoSuchElementException;
public class Stack<T> {

	private int size;
	private stackNode<T> first;

	private class stackNode<T>{
		private T element;
		private stackNode<T> prev;
	}

	//Creates Stack
	public Stack(){
		first = null;
		size = 0;
	}

	//Returns size of stack
	public int size(){
		return size;
	}

	//Adds node to stack
	public void push(T newElement){
		stackNode ogFirst = first;
		first = new stackNode();
		first.element = newElement;
		first.prev = ogFirst;
		size++;
	}

	//Returns whether or not stack is empty
	public boolean isEmpty(){
		if(first == null){
			return true;
		}
		else{
			return false;
		}
	}
	//Returns value of top node and pops node from list
	public T pop(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		T firstValue = first.element;
		first = first.prev;
		size--;
		return firstValue;
	}

	//Peek at first element w/o removing it from stack
	public T peek(){
		return first.element;
	}
}

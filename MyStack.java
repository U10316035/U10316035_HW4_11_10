import java.util.ArrayList;

//a new stack class extends Arraylist

class MyStack<Object> extends ArrayList<Object> {
	//judge if ArrayList is empty
	public boolean isEmpty(){
		return isEmpty();
	}
	//get ArrayList size
	public int getSize(){
		return size();
	}
	//get the last element of ArrayList
	public Object peek(){
		return get(getSize() - 1);
	}
	//get the last element of ArrayList and remove it 
	public Object pop(){
		Object o = get(getSize() - 1);
		remove(getSize() - 1);
		return o;
	}
	//add a new lement to ArrayList
	public void push(Object o){
		add(o);
	}
	//print out String of ArrayList
	public String toString(ArrayList<Object> stack){
		return "stack: " + stack;
	}
}

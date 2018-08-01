package test2;
import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {
	ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
	int capacity;
	public StackOfPlates(int capacity) {
		this.capacity = capacity;
	}
	
	public void add(int value) {
		Stack<Integer> last = getlaststack();
		if(last!=null && !last.isFull()) {
			last.push(value);
		}
		else {
			last = new Stack<Integer>();
			last.push(value);
			stacks.add(last);
		}
	}
	
	public int pop() {
		Stack<Integer> last=getlaststack();
		if(last == null) {
			throw new EmptyStackException();
		}
		if(last.size()==0) {
			stacks.remove(stacks.size()-1);
		}
		int temp=last.pop();
		return temp;
	}
	
	public int popAt(int index) {
		return leftshift(index,true);
	}
	
	public int leftshift(int index, boolean removetop) {
		Stack<Integer> stack = stacks.get(index);
		int removed_item;
		if(removetop) {
			removed_item = stack.pop();
			return removed_item;
		}else {
			removed_item = removeBottom();
		}
		if(stack.isEmpty()) {
			stacks.remove(index);
		} else if(stacks.size()>index+1) {
			int v = leftshift(index+1, false);
			stack.push(v);
		}
		
		return removed_item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	

}

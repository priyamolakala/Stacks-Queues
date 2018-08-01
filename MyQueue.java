package test2;
import java.util.Stack;

public class MyQueue {
	Stack<Integer> stackoldest, stacknewest;
	
	public MyQueue(){
		stacknewest = new Stack<Integer>();
		stackoldest = new Stack<Integer>();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int size() {
		return stacknewest.size()+stackoldest.size();
	}
	
	public void add(int value) {
		stacknewest.push(value);
	}
	
	public Stack<Integer> shiftStacks(Stack<Integer> s1, Stack<Integer> s2){
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2;
	}
	
	public Integer peek() {
		shiftStacks(stackoldest,stacknewest);
		return stackoldest.peek();
	}
	
	public Integer remove() {
		shiftStacks(stackoldest,stacknewest);
		return stackoldest.pop();
	}

}

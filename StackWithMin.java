package test2;
import java.util.Stack;

public class StackWithMin extends Stack<Integer> {
		Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int min() {
		if(stack.isEmpty()) {
			 return Integer.MAX_VALUE;
		} else {
		return stack.peek();
	}
	}
	public void push(int value) {
		super.push(value);
		if(value==min()) {
			stack.push(value);
		}
	}
	
	public Integer pop() {
		int temp = super.pop();
		if(temp<=min()) {
			return stack.pop();
		}
		return temp;
	}

}

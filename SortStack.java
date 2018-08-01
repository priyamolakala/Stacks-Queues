package test2;
import java.util.Stack;

public class SortStack {
	Stack<Integer> r = new Stack<Integer>();
	public Stack<Integer> sort(Stack<Integer> s) {
		while(s!=null) {
			int temp = (int)s.pop();
			
			while(!r.isEmpty() && temp < r.peek()) {
				s.push(r.pop());
			}
				r.push(temp);
			}
		return r;
	}
	
	public Stack<Integer> originalsort(Stack<Integer> r, Stack<Integer> s) {
		while(r!=null) {
			s.push(r.pop());
			}
		return r;
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

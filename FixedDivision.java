package test2;

public class FixedDivision {
	private int nofstacks = 3;
	private int stackcap;
	public int[] sizes;
	public int[] values;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void fixednumber(int stacksize) {
		stacksize = stackcap;
		sizes = new int[nofstacks];
		values = new int[stackcap*nofstacks];
	}
	
	public void push(int stacknumber, int value) {
		if(isFull(stacknumber)) {
		throw new FullStackException("Stack is Full");
		}
		sizes[stacknumber]++;
		values[indexoftop(stacknumber)] = value;
	}
	
	public int pop(int stacknumber) {
		if(isEmpty(stacknumber)) {
			throw new EmptyStackException("Stack is Empty");
		}
		int top = values[indexoftop(stacknumber)];
		values[top] = 0;
		sizes[stacknumber]--;
		return top;
		
	}
	
	public int peek(int stacknumber) {
		if(isEmpty(stacknumber)) {
			throw new EmptyStackException();
		}
		return values[indexoftop(stacknumber)];
	}
	
	public boolean isEmpty(int stacknumber) {
		return (sizes[stacknumber] == 0);
			
	}
	
	public boolean isFull(int stacknumber) {
		return sizes[stacknumber] == stackcap;
	}
	
	public int indexoftop(int stacknumber) {
		int offset = stackcap * stacknumber;
		int size = sizes[stacknumber];
		return offset+size-1;
	}

}

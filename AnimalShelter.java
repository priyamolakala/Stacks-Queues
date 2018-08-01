package test2;

public class AnimalShelter {
	
	public String name;
	public int order;
	public AnimalShelter(String name) {
		this.name = name;
	}
	private void setOrder(int ord) {
		order = ord;
	}
	public int getOrder() {
		return order;
	}
	public boolean isOlder(AnimalShelter a) {
		return this.order < a.order;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
		
	

}

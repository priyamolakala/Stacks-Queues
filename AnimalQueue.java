package test2;
import java.util.LinkedList;

public class AnimalQueue {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	int order = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void enqueue(AnimalShelter a) {
		order++;
		if(a instanceof Dog) {
			dogs.add((Dog)a);
		}
		if(a instanceof Cat) {
			cats.add((Cat)a);
		}
	}
	
	public AnimalShelter dequeue() {
		if(cats.isEmpty()) {
			
			return dequeuecats();
		}
		if(dogs.isEmpty()) {
			
			return dequeuedogs();
		}
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if(dog.isOlder(cat)) {
			return dequeuedogs();
		}
		else {
			return dequeuecats();
		}
	}
	
	public AnimalShelter dequeuecats() {
		return cats.poll();
	}
	public AnimalShelter dequeuedogs() {
		return dogs.poll();
	}
	

}

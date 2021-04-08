package premierTestClass;

public class Main {
	public static void main(String[] args) {
		Dog tim = new Dog("Tim", 12);
		Dog paul = new Dog("Paul", 3);
		tim.speak();
		
		paul.setAge(5);
		paul.speak();
		
		Cat binou = new Cat("Binou", 7);
		
		binou.speak();
		binou.setAge(9);
		binou.speak();
		
		
		
	}
}

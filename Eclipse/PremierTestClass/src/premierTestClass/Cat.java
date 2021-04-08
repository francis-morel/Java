package premierTestClass;

public class Cat extends Dog {
	
	public Cat (String name, int age) {
		super(name, age);
		
	}
	
	public void speak() {
		System.out.println("Meow, My name is " + this.name + " and i'm " + age + " years old.");
	}
}

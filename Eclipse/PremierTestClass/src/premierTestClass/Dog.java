package premierTestClass;

public class Dog {
	public int age;
	public String name;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void speak() {
		System.out.println("Woof Woof, my name is " + this.name + " and i'm " + age + " years old");
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

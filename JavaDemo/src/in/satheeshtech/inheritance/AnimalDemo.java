package in.satheeshtech.inheritance;

public class AnimalDemo {

	public static void main(String[] args) {

		Animal animal; // Compiler rule - your method call will be depending on reference type.
		animal = new Dog("Jimmy"); // 1. Compiler rule 2. JVM rule
		animal.eat();
		animal.run();
		if(animal instanceof Dog) {
			((Dog) animal).bark(); //downcasting 
		}if(animal instanceof Cat)
		((Cat) animal).bite();   //downcasting

	}

}

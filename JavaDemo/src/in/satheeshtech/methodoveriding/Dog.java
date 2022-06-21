package in.satheeshtech.methodoveriding;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " in take food from mouth");
	}
}

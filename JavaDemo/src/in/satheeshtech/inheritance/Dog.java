package in.satheeshtech.inheritance;

public class Dog extends Animal {

	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}

	public void bark() {
		System.out.println(getName()+"is Barking");
	}

}

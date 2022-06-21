package in.satheeshtech.inheritance;

public class Cat extends Animal {

	public Cat() {
		super();
	}

	public Cat(String name) {
		super(name);
	}

	public void bite() {
		System.out.println(getName()+"is biting");
	}

}

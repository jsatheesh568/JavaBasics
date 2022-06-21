package in.satheeshtech.methodoveriding;

public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println(getName() + "is eating");
	}
}

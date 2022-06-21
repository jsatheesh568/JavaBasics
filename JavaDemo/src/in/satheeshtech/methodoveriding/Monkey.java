package in.satheeshtech.methodoveriding;

public class Monkey extends Animal {

	public Monkey(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " in take food from hand to mouth");
	}

}

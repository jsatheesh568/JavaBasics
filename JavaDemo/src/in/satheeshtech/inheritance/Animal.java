package in.satheeshtech.inheritance;

public class Animal {

	private String name;
	
	public Animal() {
		this("unknown");
	}
	
	public String getName() {
		return name;
	}

	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(getName()+"is eating");
	}

	public void run() {
		System.out.println(getName()+"is running");
	}

}

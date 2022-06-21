package in.satheeshtech.abstraction;

public class Baleno extends Car {

	@Override
	public void drive() {
		System.out.println("Baleno is driven by power steering");

	}

	@Override
	public void stop() {
		System.out.println("Baleno is stopped by power brake");

	}

}

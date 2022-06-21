package in.satheeshtech.abstraction;

public abstract class Car {
	
	public Car() {
		 drive();
		 fillTank();
		 drive();
		 stop();
	}
	
	public abstract void drive();

	public abstract void stop();

	public void fillTank() {
		System.out.println("Car is fueling");
	}
}

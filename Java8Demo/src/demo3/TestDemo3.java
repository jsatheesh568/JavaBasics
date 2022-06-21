package demo3;

public class TestDemo3 {

	public static void main(String[] args) {
		Greeting morningGreeting = () -> System.out.println("Morning greeting");
		Greeting eveningGreeting = () -> System.out.println("Evening greeting");
		morningGreeting.greet();
		System.out.println(morningGreeting);
		eveningGreeting.greet();
		System.out.println(eveningGreeting);

	}

}

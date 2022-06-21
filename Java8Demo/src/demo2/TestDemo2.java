package demo2;

public class TestDemo2 {

	public static void main(String[] args) {
		Greeting morningGreeting = new Greeting() {

			@Override
			public void greet() {
				System.out.println("Morning greeting");
				
			}
			
		};
		
		Greeting eveningGreeting = new Greeting() {

			@Override
			public void greet() {
				System.out.println("Evening greeting");
				
			}
			
		};
		morningGreeting.greet();
		eveningGreeting.greet();

	}

}

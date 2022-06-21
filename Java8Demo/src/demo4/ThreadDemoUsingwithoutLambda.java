package demo4;

public class ThreadDemoUsingwithoutLambda {

	public static void main(String[] args) {
		Runnable target = new Runnable() {
			
			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				
				for(int i=0 ; i<=10 ; i++) {
					System.out.println(threadName+""+i);
				}
			}
		};
		
		Thread thread1 = new Thread(target);
		Thread thread2 = new Thread(target);
		thread1.setName("SATHEESH");
		thread2.setName("Deepika");
		thread1.start();
		thread2.start();
	}
}

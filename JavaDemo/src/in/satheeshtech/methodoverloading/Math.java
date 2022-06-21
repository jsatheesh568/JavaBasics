package in.satheeshtech.methodoverloading;

public class Math {

	public void add(int a, int b) {
		System.out.println("-----add(int a, int b)------"+(a+b));

	}
	public void add(int a, float b) {
		System.out.println("-----add(int a, float b)------"+(a+b));

	}
	public void add(float a, int b) {
		System.out.println("-----add(float a, int b)------"+(a+b));

	}
	public void add(float a, float b) {
		System.out.println("-----add(float a, float b)------"+(a+b));

	}
}

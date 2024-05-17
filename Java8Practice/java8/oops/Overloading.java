package oops;

public class Overloading {

	public void testMethod() {
		System.out.println("1st method--------");
	}

	public int testMethod(int a) {
		System.out.println("2nd method--------");
		return a * a;
	}

	public int testMethod(int a, int b) {
		System.out.println("3nd method--------");
		return a + b;
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.testMethod(12);
		// o.testMethod("Hello");
		System.err.println(o.testMethod(12, 12));
	}
}

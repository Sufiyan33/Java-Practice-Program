package oops;

public class InterfaceImpl implements FirstInterface, SecondInterface {

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		InterfaceImpl i = new InterfaceImpl();
		System.out.println(i.add(12, 45));
		System.out.println(i.substract(50, 12));
		System.out.println(i.multiply(3, 10));
		System.out.println(InterfaceImpl.divide(10, 2));
	}
}

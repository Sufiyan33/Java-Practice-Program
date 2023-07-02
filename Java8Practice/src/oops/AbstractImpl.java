package oops;

public class AbstractImpl extends AbstractExample {

	@Override
	public int substract(int a, int b) {
		System.err.println("-------- do substraction -------");
		return a - b;
	}

	@Override
	int add(int a, int b) {
		System.err.println("-------- do addition -------");
		return a + b;
	}

	public static void main(String[] args) {
		AbstractImpl impl = new AbstractImpl();
		System.out.println("Substraction is :: " + impl.substract(10, 2));
		System.out.println("Addition is :: " + impl.add(10, 10));

		System.err.println("------different ways-------");
		AbstractExample a = new AbstractExample() {

			@Override
			public int substract(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}

			@Override
			int add(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		System.err.println(a.add(2, 3));
	}
}

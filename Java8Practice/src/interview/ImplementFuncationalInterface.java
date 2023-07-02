package interview;

public class ImplementFuncationalInterface {

	public static void main(String[] args) {
		int x = 10, y = 20;

		DemoInterface rk = (a, b) -> a * b;
		int cal = rk.calculate(x, y);
		System.out.println(cal);
	}
}

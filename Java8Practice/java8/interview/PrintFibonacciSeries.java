package interview;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 1, count = 10;
		for (int i = 1; i <= count; i++) {
			System.out.println(a);
			a = b;
			b = c;
			c = a + b;
		}
	}
}

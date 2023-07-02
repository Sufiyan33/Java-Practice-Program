package interview;

public class PrintNumber {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < 100) {
			sum = sum + i;
			sum = i + sum;
			i += 1;
		}
		System.out.println(sum);
	}
}

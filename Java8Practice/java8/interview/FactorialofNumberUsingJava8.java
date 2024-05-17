package interview;

import java.util.stream.LongStream;

public class FactorialofNumberUsingJava8 {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(factorialUsingStreams(number));
	}

	public static long factorialUsingStreams(int n) {
		return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
	}
}

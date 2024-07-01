package interview_revision_questions;

import java.util.stream.Stream;

public class PrintFibonacciSerires {

	/*
	 * Write a program to print the Fibonacci Series.
	 */

	public static void main(String[] args) {
		Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10).map(f -> f[0])
				.forEach(System.out::println);
	}
}

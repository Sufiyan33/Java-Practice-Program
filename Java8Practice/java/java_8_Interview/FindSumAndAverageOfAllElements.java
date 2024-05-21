package java_8_Interview;

import java.util.Arrays;

public class FindSumAndAverageOfAllElements {

	/*
	 * Find sum and average of all elements of list or array.
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };
		Integer sum = Arrays.stream(a).sum();
		System.out.println("Sum of all numbers :: " + sum);

		Double average = Arrays.stream(a).average().getAsDouble();
		System.out.println("Average of all numbers :: " + average);
	}
}

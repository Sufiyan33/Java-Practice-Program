package java_8_Interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortTwoUnsortedArraysIntoSortedArray {

	public static void main(String[] args) {
		/*
		 * Below process will merge array into sorted array with having duplicate
		 * number.
		 */
		int[] a = new int[] { 4, 2, 7, 1, 2 };

		int[] b = new int[] { 8, 3, 9, 5, 9 };

		int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println(Arrays.toString(array));

		/*
		 * To avoid duplicate number from list add distinct method at the last.
		 */
		System.out.println("--- Without Duplicate ---");
		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(c));
	}
}

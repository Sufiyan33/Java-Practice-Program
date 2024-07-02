package interview_revision_questions;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLowestNumber {

	/*
	 * Write a program to Find the Second Lowest Number.
	 */
	public static void main(String[] args) {
		int arr[] = { 3, 6, 32, 1, 8, 5, 31, 22, 2 };

		Arrays.stream(arr).boxed().sorted(Comparator.naturalOrder()).skip(1).findFirst().ifPresent(System.out::println);
		Arrays.stream(arr).boxed().sorted(Integer::compare).skip(1).findFirst().ifPresent(System.out::println);
		Arrays.stream(arr).boxed().sorted(Integer::compareTo).limit(2).skip(1).findFirst()
				.ifPresent(System.out::println);
	}
}

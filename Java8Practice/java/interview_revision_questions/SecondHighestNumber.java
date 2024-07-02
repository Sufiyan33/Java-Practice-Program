package interview_revision_questions;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {

	/*
	 * Write a program to find the second-highest number in an array.
	 */

	public static void main(String[] args) {
		int arr[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
	}
}

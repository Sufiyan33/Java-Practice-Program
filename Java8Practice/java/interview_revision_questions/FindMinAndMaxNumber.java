package interview_revision_questions;

import java.util.Arrays;

public class FindMinAndMaxNumber {

	/*
	 * Write a program to find min and max numbers in the array.
	 */
	public static void main(String[] args) {

		int a[] = { 2, 3, 1, 22, 11, 33, 5 };
		Integer min = Arrays.stream(a).boxed().min(Integer::compareTo).get();
		int max = Arrays.stream(a).boxed().max(Integer::compareTo).get();

		System.out.println("Max And min is are : " + max + " " + min);
	}
}

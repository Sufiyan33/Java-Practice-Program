package interview_revision_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateNumber {

	/*
	 * Write a program to print duplicate numbers.
	 */

	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 2, 12, 34, 2, 11, 4 };

		// This one will give you duplicate + it's count.
		Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(value -> value.getValue() > 1).forEach(System.out::println);

		// This one will give you only duplicate number.
		Map<Integer, Long> map = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.keySet().stream().filter(x -> map.get(x) > 1).forEach(System.out::println);
	}
}

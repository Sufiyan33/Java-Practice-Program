package interview_revision_questions;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateString {

	/*
	 * Write a program to print duplicate strings.
	 */

	public static void main(String[] args) {
		String input = "JavaAPICollections";
		
		input.chars().mapToObj(ch -> Character.toLowerCase((char) ch))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1L).map(Entry::getKey).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}

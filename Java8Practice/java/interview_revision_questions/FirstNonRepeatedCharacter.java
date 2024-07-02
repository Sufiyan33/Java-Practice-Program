package interview_revision_questions;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	/*
	 * Write a program to print the First Not Repeated Char in string.
	 */

	public static void main(String[] args) {
		String input = "Java Stream API is very good concept";
		
		input.chars().mapToObj(ch -> Character.toLowerCase((char) ch))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(k -> k.getValue() == 1L).map(x -> x.getKey()).findFirst()
				.ifPresent(System.out::println);
	}
}

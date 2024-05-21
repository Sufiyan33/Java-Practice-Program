package java_8_Interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEachCharacter {

	public static void main(String[] args) {
		String input = "Java Concept Of The Day";
		input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().forEach(System.out::println);

		// In above example characters are in upper and lower case. let's make in upper
		// or lower case.

		System.out.println("----------------------------");
		Map<Character, Long> collect = input.chars().mapToObj(e -> Character.toLowerCase((char) e))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

	}
}

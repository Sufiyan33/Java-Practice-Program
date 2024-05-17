package java_8_Interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	/*
	 * Find stream from string... (example :: input.chars()) 1 - First convert
	 * string into Character object. 2 - Then find identity and count all characters
	 * then store in LinkedHashMap so that avoid duplicate.
	 */
	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);

		// OR you can also store in a variable and print it.

		Character c = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();

		System.out.println(c);
	}
}

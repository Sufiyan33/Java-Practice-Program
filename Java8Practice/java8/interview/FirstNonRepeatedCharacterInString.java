package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";
		Character result = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst()
				.get();

		System.out.println(result);

		List<String> str = Arrays.asList("Apple", "Mango", "Banan");
		str.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("-------------------------------");
		List<String> st = Arrays.asList("apple", "Mango", "Banan", "apricot");
		st.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).forEach(System.out::println);

		System.out.println("--- sort in asc order ---");
		st.stream().map(String::toLowerCase).sorted(Comparator.naturalOrder()).forEach(System.out::println);

	}

	/*
	 * 1- convert string to stream 2- convert it into lowercase or uppercase. 3- use
	 * collector to collect data and create a new LinkedHasMap. 4- get entrySet and
	 * then get value.
	 */
}

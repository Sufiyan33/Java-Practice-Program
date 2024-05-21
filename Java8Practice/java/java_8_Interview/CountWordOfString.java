package java_8_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOfString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);
	}
}

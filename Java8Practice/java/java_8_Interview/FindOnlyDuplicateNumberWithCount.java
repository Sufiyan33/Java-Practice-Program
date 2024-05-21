package java_8_Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOnlyDuplicateNumberWithCount {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		names.stream().filter(e -> Collections.frequency(names, e) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);
	}
}

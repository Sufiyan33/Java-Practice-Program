package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateStringAndCount {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Suresh", "Sabir", "Suresh");
		Set<String> set = new HashSet<>();
		list.stream().filter(e -> !set.add(e)).forEach(System.out::println);

		Map<String, Long> duplicate = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(duplicate);
		
		Map<String, Long> duplicateCount = list.stream().filter(e -> Collections.frequency(list, e) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(duplicateCount);
	}
}

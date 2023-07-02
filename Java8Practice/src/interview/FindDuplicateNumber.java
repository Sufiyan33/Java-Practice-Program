package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 98);
		Set<Integer> set = new HashSet<>();
		Set<Integer> setData = list.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
		System.out.println(setData);

		Map<Integer, Long> duplicate = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(duplicate);
		
		Iterator<Entry<Integer, Long>> itr = duplicate.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, Long> i = itr.next();
			if (i.getValue() > 1) {
				System.out.println("key is :: " + i.getKey() + " value is :: " + i.getValue());
			}
		}
		
		System.out.println("----------------------------------------------");
		Map<Integer, Long> duplicateCount = list.stream().filter(e -> Collections.frequency(list, e) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(duplicateCount);


	}
}

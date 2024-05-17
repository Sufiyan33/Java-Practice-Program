package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortSTringArrayData {

	public static void main(String[] args) {
		String[] fruits = { "apple", "orange", "banana", "pear", "kiwi" };

		for (int i = 0; i < fruits.length - 1; i++) {
			for (int j = i + 1; j < fruits.length; j++) {
				if (fruits[i].compareTo(fruits[j]) > 0) {
					String temp = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(fruits));

		System.out.println("--------------------------");

		List<String> collect = Arrays.stream(fruits).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("sorted :: " + collect);
		System.out.println("--------------------------");

		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));

		List<Integer> list = Arrays.asList(1, 2, 4, 6);
		Integer reduce = list.stream().reduce(Integer::sum).get();
		System.out.println(reduce);
	}
}

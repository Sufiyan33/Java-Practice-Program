package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	/*
	 * Converting 2D array into 1D array OR Converting list of list into a single
	 * list
	 */
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();

		list.add(Arrays.asList(1, 7));
		list.add(Arrays.asList(8, 6));
		list.add(Arrays.asList(9, 2));
		list.add(Arrays.asList(20, 4));
		list.add(Arrays.asList(83, 10));
		list.add(Arrays.asList(11, 9));

		System.out.println("--- Old way ---");
		System.out.println(list);

		System.out.println("--- Using FlatMap ---");
		List<Integer> l = list.stream().flatMap(ls -> ls.stream()).collect(Collectors.toList());
		System.out.println(l);

		/*
		 * Print only even number from above 2D array.
		 */

		System.out.println("--- Find even number ---");
		list.stream().flatMap(e -> e.stream().filter(s -> s % 2 == 0)).collect(Collectors.toList())
				.forEach(System.out::println);

		/*
		 * Find number which are starting from one from above 2D array.
		 */
		
		System.out.println("--- Number starting from one ---");
		list.stream().flatMap(e -> e.stream().map(s -> s + " ").filter(i -> i.startsWith("1")))
				.collect(Collectors.toList()).forEach(System.out::println);
	}
}

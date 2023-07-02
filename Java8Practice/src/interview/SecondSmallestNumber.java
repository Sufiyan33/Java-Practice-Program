package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 34, 53, 1, 3, 5, 6, 51, 64);
		list.stream().sorted(Integer::compare).skip(1).findFirst().ifPresent(System.out::println);
		list.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().ifPresent(System.out::println);
		list.stream().sorted(Comparator.naturalOrder()).limit(2).skip(1).findFirst().ifPresent(System.out::println);
		list.stream().sorted(Integer::compareTo).skip(1).findFirst().ifPresent(System.out::println);

		List<Integer> dupList = Arrays.asList(12, 34, 53, 1, 2, 3, 2, 3, 5, 6, 51, 64);
		dupList.stream().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst()
				.ifPresent(System.out::println);

		int[] a = { 2, 2, 4, 12, 32, 21, 41 };
		Arrays.stream(a).boxed().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst()
				.ifPresent(System.out::println);
		System.out.println("---------------------");
		list.stream().sorted().skip(1).findFirst().ifPresent(System.out::println);
	}
}

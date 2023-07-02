package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestNumber {
	/*
	 * we can use different below method to find smallest number. 1- By using
	 * Stream().min() method. 2- By using Stream().collect() method. 3- By using
	 * Stream().reduce() method. 4- By using IntStream().summaryStatics() method.
	 */
	public static void main(String[] args) {
		System.err.println("---By using stream().min() method---");
		List<Integer> list = Arrays.asList(12, 34, 53, 1, 3, 5, 6, 51, 64);
		list.stream().min(Integer::compare).ifPresent(System.out::println);
		list.stream().min(Integer::compareTo).ifPresent(System.out::println);
		list.stream().mapToInt(Integer::valueOf).min().ifPresent(System.out::println);
		list.stream().min(Comparator.comparing(Integer::valueOf)).ifPresent(System.out::println);
		list.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);

		System.out.println("---By using stream().collect() method---");
		list.stream().collect(Collectors.minBy(Comparator.naturalOrder())).ifPresent(System.out::println);
		list.stream().collect(Collectors.minBy(Comparator.comparing(Integer::valueOf))).ifPresent(System.out::println);
		list.stream().collect(Collectors.reducing(Integer::min)).ifPresent(System.out::println);
		list.stream().collect(Collectors.reducing(Math::min)).ifPresent(System.out::println);
		Integer a = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMin();
		System.out.println(a);
		
		System.out.println("---By using stream().reduce() method---");
		list.stream().reduce(Integer::min).ifPresent(System.out::println);
		list.stream().reduce(Math::min).ifPresent(System.out::println);
		list.stream().reduce((x, y) -> x < y ? x : y).ifPresent(System.out::println);
		list.stream().reduce((x, y) -> Math.min(x, y)).ifPresent(System.out::println);
		list.stream().reduce((x, y) -> Integer.min(x, y)).ifPresent(System.out::println);

		int[] aa = { 15, 9, 4, 13, 21 };
		int smallestNumber = Arrays.stream(aa).min().getAsInt();
		System.out.println(smallestNumber);

		int smallNumber = Arrays.stream(aa).summaryStatistics().getMin();
		System.out.println("SmallestNumber :: " + smallNumber);
	}
}

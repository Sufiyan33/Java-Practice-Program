package top50java8coding;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top50Java8CodingQuestion {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().filter(e -> (e % 2 == 0)).forEach(System.out::println);
		
		System.out.println("Find number starting with 1");
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		list.stream().map(e -> e + " ").filter(e -> e.startsWith("1")).forEach(System.out::println);
		
		System.out.println("Find duplicate number");
		List<Integer> dup = Arrays.asList(10,15,8,49,25,98,98,32,15);
		dup.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Integer> set = new HashSet<>();
		dup.stream().filter(e -> !set.add(e)).forEach(System.out::println);

		System.out.println("Find the first element of the list ");
		List<Integer> listt = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		listt.stream().findFirst().ifPresent(System.out::println);

		System.out.println("Find the total number of elements ");
		long count = listt.stream().count();
		System.out.println(count);

		System.out.println("Find the maximum value element present ");
		listt.stream().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
		listt.stream().max(Integer::compareTo).ifPresent(System.out::println);

		System.out.println("Find the first non-repeated character ");
		String input = "Java Hungry Blog Alive is Awesome";
		input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);

		System.out.println("Find the first repeated character ");
		input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);

		System.out.println("sort all the values present in");
		listt.stream().sorted().forEach(System.out::println);

		System.out.println("sort all the values present in descending order");
		listt.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		listt.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		System.out.println("How will you get the current date and time using Java 8 Date and Time API?");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		System.out.println("program to concatenate two Streams");
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");

		Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);

		System.out.println("perform cube on list elements and filter numbers greater than 50.");
		List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		integerList.stream().map(e -> e * e * e).filter(i -> i > 50).forEach(System.out::println);
		integerList.stream().map(e -> Math.pow(e, 2)).filter(e -> e > 10).forEach(System.out::println);

		System.out.println("program to sort an array and then convert the sorted array into Stream?");
		int arr[] = { 99, 55, 203, 99, 4, 91 };
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(System.out::println);

		System.out.println("How to use map to convert object into Uppercase in Java 8?");
		String[] a = { "aa", "bb", "cc" };
		Arrays.stream(a).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(
				"How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?");
		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 55));

		noteLst.add(new Notes(6, "note4", 66));
		noteLst.stream().sorted(Comparator.comparingInt(Notes::getId)).collect(
				Collectors.toMap(Notes::getId, Notes::getId, (oldValue, newValue) -> oldValue, LinkedHashMap::new))
				.entrySet().forEach(System.out::println);

		System.out.println("How to count each element/word from the String ArrayList in Java8?");
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);

		System.out.println("How to find only duplicate elements with its count from the String ArrayList in Java8");
		names.stream().filter(x -> Collections.frequency(names, x) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);

		System.out.println("Write a program to print the count of each character in a String?");
		String s = "string data to count each character";
		Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting())).entrySet()
				.forEach(System.out::println);

	}
}

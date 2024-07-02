package interview_revision_questions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatteningListObject {

	/*
	 * Write a program to a Flattering list of objects. There are two method by
	 * which you can do
	 * 
	 * 1 - Stream.concat()
	 * 
	 * 2 - Stream.of()
	 */
	public static void main(String[] args) {
		List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9, 11);
		List<Integer> evenList = Arrays.asList(2, 4, 6, 8, 10);

		List<Integer> list = Stream.concat(oddList.stream(), evenList.stream()).collect(Collectors.toList());
		System.out.println(list);

		List<List<Integer>> list1 = Arrays.asList(oddList, evenList);
		List<Integer> collect = list1.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> collect2 = Stream.of(oddList, evenList).flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println(collect2);
	}
}

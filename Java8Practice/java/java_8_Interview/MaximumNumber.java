package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().max(Integer::compare).ifPresent(System.out::println);

		long num = myList.stream().sorted(Integer::compare).max(Integer::compare).get();
		System.out.println(num);
	}
}

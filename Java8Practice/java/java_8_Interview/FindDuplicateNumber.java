package java_8_Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 8);
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(e -> !set.add(e)).map(e -> e).forEach(System.out::print);
	}
}

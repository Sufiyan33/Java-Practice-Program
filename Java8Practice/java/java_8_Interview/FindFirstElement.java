package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().findFirst().ifPresent(System.out::println);
	}
}

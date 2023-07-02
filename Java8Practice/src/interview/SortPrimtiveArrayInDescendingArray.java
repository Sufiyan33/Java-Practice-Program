package interview;

import java.util.Arrays;
import java.util.Collections;

public class SortPrimtiveArrayInDescendingArray {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 4, 5, 2, 3, 0 };
		Arrays.stream(arr).boxed().sorted(Collections.reverseOrder())
		.forEach(System.out::println);
	}
}

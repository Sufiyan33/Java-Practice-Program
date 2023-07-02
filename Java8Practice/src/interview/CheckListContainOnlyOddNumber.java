package interview;

import java.util.Arrays;
import java.util.List;

public class CheckListContainOnlyOddNumber {

	public static void main(String[] args) {
		List<Integer> arr =Arrays.asList(12, 2, 3, 7, 8, 9, 11);
		for (Integer i : arr) {
			if (i % 2 == 0) {
				System.out.println("number is prime");
			}
		}
	}
}

package interview;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxAndMinValue {

	public static void main(String[] args) {
		int[] arr = { 1, 23, 4, 2, 22, 33, 11, 5, 9 };
		int max = arr[0];
		int min = arr[0];

		for (int i : arr) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
		}
		System.out.println("max :: " + max + " min :: " + min);

		Arrays.stream(arr).boxed().max(Integer::compareTo).ifPresent(System.out::println);
		Arrays.stream(arr).boxed().min(Integer::compareTo).ifPresent(System.out::println);

		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
	}
}

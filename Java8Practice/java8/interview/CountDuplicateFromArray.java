package interview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateFromArray {

	public static void main(String[] args) {
		String[] arr = { "abscater", "ebdsa", "2365", "12ybay4" };

		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
					.entrySet().forEach(System.out::println);
		}
	}
}

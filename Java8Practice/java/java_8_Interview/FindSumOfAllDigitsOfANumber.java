package java_8_Interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSumOfAllDigitsOfANumber {

	/*
	 * Find sum of all digits of a Number. example : 123 = 6
	 */
	public static void main(String[] args) {
		int i = 15623;
		Integer sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sum);
	}
}

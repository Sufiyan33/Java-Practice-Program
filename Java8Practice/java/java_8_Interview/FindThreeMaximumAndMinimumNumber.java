package java_8_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindThreeMaximumAndMinimumNumber {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		System.out.println("-------------------------");
		System.out.println("Three Minimum number");
		System.out.println("-------------------------");

		listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);

		System.out.println("-------------------------");
		System.out.println("Three Maximum number");
		System.out.println("-------------------------");

		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}
}

package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class PrintNumberMultipleOfFive {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		listOfIntegers.stream().filter(i -> i % 5 == 0).map(i -> i).forEach(System.out::println);
	}
}

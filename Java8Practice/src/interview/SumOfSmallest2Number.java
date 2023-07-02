package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOfSmallest2Number {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 2, 33, 23, 13, 11, 32);
		Integer sum = list.stream().sorted(Comparator.naturalOrder()).limit(2).reduce(0, Integer::sum);
		System.out.println("Sum of smallest 2 number :: " + sum);

		System.out.println(System.getenv("TEMP"));
	}
}

package interview;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumberFromList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().filter(e -> (e % 2 == 0)).forEach(System.out::println);
	}
}

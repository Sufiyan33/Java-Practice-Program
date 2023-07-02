package interview;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementOfList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		list.stream().findFirst().ifPresent(System.out::println);

		Integer firstElement = list.stream().findFirst().get();
		System.out.println(firstElement);
	}

}

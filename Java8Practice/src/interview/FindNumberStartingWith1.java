package interview;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartingWith1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().map(e -> e + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
	}
}

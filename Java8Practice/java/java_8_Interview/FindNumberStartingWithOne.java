package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartingWithOne {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().map(s -> s + " ").filter(e -> e.startsWith("1")).forEach(System.out::println);
	}
}

package java_8_Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListInBothOrder {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9, 73, 14, 10, 12, 67, 2, 0, 1, 3);
		list.stream().sorted().forEach(e -> System.out.println(e));
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("---- Descending order ----");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}

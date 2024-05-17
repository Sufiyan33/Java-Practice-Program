package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class FindAllEvenNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().filter(e -> e % 2 == 0).map(e -> e).forEach(System.out::println);
	}
}

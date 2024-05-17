package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcateTwoListOrStream {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");
		Stream<String> concate = Stream.concat(list1.stream(), list2.stream());
		concate.forEach(System.out::println);
	}
}

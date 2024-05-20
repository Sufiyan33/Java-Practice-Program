package flatMap;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilertCharUsingFlatMap {

	/*
	 * Make a list which can't contain letter a in 2D array
	 */
	public static void main(String[] args) {
		String[][] arr = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" }, { "g", "h" } };

//		String[] st = Stream.of(arr).flatMap(Stream::of).toArray(String[]::new);
//
//		for (String result : st) {
//			System.out.println(result);
//		}

		Stream.of(arr).flatMap(Stream::of).filter(e -> !"a".equals(e)).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}

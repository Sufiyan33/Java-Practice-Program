package java_8_Interview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfString {

	/*
	 * Reverse each word of a string by using Java 8.
	 */
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";

		String reverse = Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reverse);

		// OR
		System.out.println("-------------------");
		Arrays.stream(str.split(" ")).map(w -> new StringBuffer(w).reverse()).forEach(System.out::println);
	}
}

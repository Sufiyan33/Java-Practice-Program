package java_8_Interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountEachCharacterInString {

	/*
	 * basically you need to find out frequency. here we will use map not
	 * function.identity method.
	 */
	public static void main(String[] args) {
		String s = "string data to count each character";
		Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting())).entrySet()
				.forEach(System.out::println);
	}
}

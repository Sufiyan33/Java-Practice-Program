package java_8_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringListBasedOnIncreasingLength {

	/*
	 * Sort the string list or array based on their increasing length.
	 */
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}

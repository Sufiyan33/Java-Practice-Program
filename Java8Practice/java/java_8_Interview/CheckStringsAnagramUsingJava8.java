package java_8_Interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStringsAnagramUsingJava8 {

	public static void main(String[] args) {
		String s1 = "RaceCar";
		String s2 = "CarRace";

		s1 = Stream.of(s1.split("")).map(String::toUpperCase).collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).collect(Collectors.joining());

		/*
		 * String result = s1.equals(s2) ? "Strings are Anagram" :
		 * "Srings are not Anagram"; System.out.println(result);
		 */
		if (s1.equals(s2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

		// Need to fix.
	}
}

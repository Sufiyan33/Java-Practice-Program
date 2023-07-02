package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {
		String string = "i like java java coding java and you do you interested in java coding coding.";
		String collect = Arrays.stream(string.split("\\s+")).distinct().collect(Collectors.joining(" "));
		System.out.println(collect);
	}
}

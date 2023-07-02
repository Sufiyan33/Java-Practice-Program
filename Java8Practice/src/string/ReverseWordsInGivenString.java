package string;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInGivenString {

	public static void main(String[] args) {
		String s = "i love programming very much";
		String str[] = s.split(" ");
		Collections.reverse(Arrays.asList(str));
		System.out.println(String.join(" ", str));
	}
}

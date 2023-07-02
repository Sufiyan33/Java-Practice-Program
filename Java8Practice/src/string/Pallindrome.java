package string;

import java.util.stream.IntStream;

public class Pallindrome {

	public static void main(String[] args) {
		String str = "Radar".toLowerCase();
		boolean noneMatch = IntStream.range(0, str.length() / 2)
				.noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
		System.out.println(noneMatch);
	}
}

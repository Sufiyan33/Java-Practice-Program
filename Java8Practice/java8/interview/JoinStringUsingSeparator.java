package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringUsingSeparator {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Welcome", "to", "TechGeekNext");
		String result = str.stream().map(String::valueOf).collect(Collectors.joining("-"));
		System.err.println(result);
	}
}

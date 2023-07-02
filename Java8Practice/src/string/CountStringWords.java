package string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountStringWords {

	public static void main(String[] args) {
		String s = "This this is is done by Saket Saket";
		String[] split = s.toUpperCase().split(" ");
		List<String> str = Arrays.asList(split);
		Map<String, Long> collect = str.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}
}

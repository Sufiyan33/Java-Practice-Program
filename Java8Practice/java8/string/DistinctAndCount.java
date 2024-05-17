package string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctAndCount {

	public static void main(String[] args) {
		String str = "abcdABCDabcd";
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char i : chars) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + i);
			} else {
				map.put(i, 1);
			}
		}
		// System.out.println(map);
		map.entrySet().forEach(System.out::println);

		System.out.println("---by using java 8 ---");
		str.chars().boxed().distinct().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.forEach(System.out::println);
	}
}

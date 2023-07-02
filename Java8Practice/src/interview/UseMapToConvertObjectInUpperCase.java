package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseMapToConvertObjectInUpperCase {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("a", "b", "c", "d");
		List<String> list = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
		list.forEach(s -> System.out.println(s + ""));
		System.out.println(list);
	}
}

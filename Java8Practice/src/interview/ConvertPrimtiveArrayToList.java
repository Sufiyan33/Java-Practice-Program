package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertPrimtiveArrayToList {

	public static void main(String[] args) {
		int arr[] = { 9, 1, 3, 9, 7 };
		List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
		result.forEach(System.out::println);
		System.out.println(result);

		System.out.println("============OR=============");
		IntStream.of(arr).boxed().collect(Collectors.toList()).forEach(System.out::println);
	}
}

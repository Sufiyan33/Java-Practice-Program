package interview;

import java.util.Arrays;

public class SortArrayThenConvertIntoStream {

	public static void main(String[] args) {

		int arr[] = { 99, 55, 100, 56, 12 };
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(s -> System.out.println(s + ""));
	}

}

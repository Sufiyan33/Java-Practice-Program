package java_8_Interview;

import java.util.Arrays;

public class FindMaximumNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 12, 19, 20, 88, 00, 9 };
		Integer a = Arrays.stream(arr).max().getAsInt();
		System.out.println(a);
	}
}

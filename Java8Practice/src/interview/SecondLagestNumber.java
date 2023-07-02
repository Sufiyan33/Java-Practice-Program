package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLagestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 34, 53, 1, 3, 5, 6, 51, 64);
		Integer s = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("2nd highest number :: " + s);
		
		Integer sum = list.stream().sorted(Comparator.reverseOrder()).limit(2).reduce(0, Integer::sum);
		System.out.println("Second Lagest 2 Number sum :: " + sum);

		Integer ss = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println("2nd highest number :: " + ss);

		int[] arr = { 12, 3, 4, 54, 31, 42 };
		Integer sss = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("2nd highest number :: " + sss);

		int[] ar = { 12, 3, 4, 4, 54, 31, 42, 42, 54 };
		Integer s1 = Arrays.stream(ar).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("2nd highest number :: " + s1);
		
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				secondMax = max;
				max = ar[i];
			} else if (ar[i] > secondMax && ar[i] != max) {
				secondMax = ar[i];
			}
		}
		System.out.println("Second max :: " + secondMax);
		System.out.println("Max :: " + max);
	}
}

package interview;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class PrintNumberBetweenMinAndMax {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 5, 7, 8, 9 };
		IntSummaryStatistics summaryStatistics = Arrays.stream(arr).boxed()
				.collect(Collectors.summarizingInt(Integer::intValue));

		int max = summaryStatistics.getMax();
		int min = summaryStatistics.getMin();
		// System.out.println(max + " " + min);

		// System.out.println(a);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min && arr[i] != max) {
				if (arr[i] != 5 && arr[i] != 7) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}

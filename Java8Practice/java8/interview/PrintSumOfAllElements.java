package interview;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class PrintSumOfAllElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 4, 10, 12, 87, 33, 75);
		IntSummaryStatistics statics = numbers.stream().mapToInt((e) -> e).summaryStatistics();
		System.out.println("total sum is :: " + statics.getSum());
	}
}

package interview;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class PrintDateofNextTuesday {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("next tuesday date is :: " + nextTuesday);
	}
}

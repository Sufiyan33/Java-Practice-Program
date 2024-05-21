package java_8_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeprateEvenAndOddNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Set<Entry<Boolean, List<Integer>>> entry = list.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0))
				.entrySet();


		for (Entry<Boolean, List<Integer>> itr : entry) {
			System.out.println("-----------------------------");
			if (itr.getKey()) {
				System.out.println("Even Numbers");
			} else {
				System.out.println("Odd Numbers");
			}

			System.out.println("-----------------------------");
			for (Integer ee : itr.getValue()) {
				System.out.println(ee);
			}
		}
	}
}

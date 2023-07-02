package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReturnTrueIfDuplicatePresentOtherWiseFalse {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		List<Integer> myList = list.stream().collect(Collectors.toList());

		System.out.println("myList size is :: " + myList.size());
		Set<Integer> set = new HashSet<>(myList);
		System.out.println("set size is :: " + set.size());
		boolean result = set.size() == myList.size() ? false : true;
		System.out.println("Result is : " + result);
	}
}

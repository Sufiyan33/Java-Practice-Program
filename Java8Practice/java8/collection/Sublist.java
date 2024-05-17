package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sublist {

	public static void main(String[] args) {
		Integer[] ar = { 12, 13, 2, 4, 5, 4, 6, 3, 6, 7 };
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(ar));
		al.stream().map(e -> e).forEach(System.out::println);

		System.out.println("----------- Making sublist---------");

		List<Integer> subList = al.subList(3, 6);
		for (Integer aa : subList) {
			System.out.println(aa);
		}

		System.out.println("----------- Swapping data----------");
		Collections.swap(al, 1, 3);
		System.out.println(al);
	}
}

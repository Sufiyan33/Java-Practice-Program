package collection;

import java.util.Arrays;
import java.util.List;

public class ValueExistInList {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(12, 3, 4, 67, 24, 35, 45);
		if (al.contains(4))
			System.out.println("available");
		else
			System.err.println("not available");
	}
}

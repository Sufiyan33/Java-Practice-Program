package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertListToArray {

	public static void main(String[] args) {
		Integer[] s = { 1, 2, 3 };
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(s));
		for (Integer aa : al) {
			System.out.println(aa);
		}

		Object[] array = al.toArray();
		for (Object oo : array) {
			System.out.println(oo);
		}
	}
}

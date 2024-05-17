package interview;

import java.util.Arrays;
import java.util.List;

public class RemoveListData {

	public static void main(String[] args) {
		List<Integer> L1 = Arrays.asList(1, 2, 7, 3, 4);
		List<Integer> L2 = Arrays.asList(3, 4);
		
		// L1.removeAll(L2);
		/*
		 * for (int a : L1) { System.out.println(a); }
		 */
		
		L1.retainAll(L2);
		for (int a : L1) {
			System.out.println(a);
		}
	}
}

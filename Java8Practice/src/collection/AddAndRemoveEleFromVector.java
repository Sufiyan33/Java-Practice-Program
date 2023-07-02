package collection;

import java.util.Iterator;
import java.util.Vector;

public class AddAndRemoveEleFromVector {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		for (int i = 1; i <= 30; i++) {
			vector.add(i);
		}

		Iterator<Integer> itr = vector.iterator();
		while (itr.hasNext()) {
			Integer number = itr.next();
			if (number % 2 == 0) {
				System.out.println("Even :: " + number);
			} else if (number % 2 != 0) {
				itr.remove();
			}
		}
	}
}

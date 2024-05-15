package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i <= 10; i++) {
			v.add(i);
		}

		// System.out.println(v);
		Enumeration<Integer> elements = v.elements();
		while (elements.hasMoreElements()) {
			Integer s = elements.nextElement();
			System.out.println(s);
		}
	}
}

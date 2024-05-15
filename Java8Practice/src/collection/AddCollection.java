package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class AddCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(14);

		System.out.println(al);

		Vector<Integer> v = new Vector<>(al);
		v.add(20);
		v.add(21);
		v.add(22);
		v.add(22);

		System.out.println(v);

		LinkedList<Integer> ll = new LinkedList<>(v);
		ll.add(30);
		ll.add(31);
		ll.add(32);
		ll.add(32);

		System.out.println(ll);

		HashSet<Integer> set = new HashSet<>(v);
		set.add(null);
		set.add(40);
		set.add(41);
		set.add(42);
		set.add(42);

		System.out.println(set);

		TreeSet<Integer> t = new TreeSet<>(ll);
		t.add(50);
		t.add(51);
		t.add(52);

		System.out.println(t);

	}
}

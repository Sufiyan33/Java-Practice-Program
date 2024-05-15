package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(23, "Zaa"));
		al.add(new Student(12, "Xaa"));
		al.add(new Student(01, "Aaa"));
		al.add(new Student(25, "Kaa"));
		al.add(new Student(05, "Baa"));

		System.out.println("--- Unsorted data ---");
		System.out.println(al);

		System.out.println("--- Sorted by RollNo. ---");
		Collections.sort(al, new SortByRollNo());
		System.out.println(al);

		System.out.println("--- Sorted by Name ---");
		Collections.sort(al, new SortByName());
		System.out.println(al);
	}
}

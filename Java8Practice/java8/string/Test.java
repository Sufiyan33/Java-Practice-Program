package string;

import java.time.LocalDate;
import java.util.HashMap;

import modal.Employee;

public class Test {

	public static void main(String[] args) {
		HashMap<Employee, String> map = new HashMap<>();
		Employee s1 = new Employee(1, "sfiiyan", "EE", "M", 1233, LocalDate.now(), 12);
		Employee s2 = new Employee(1, "Ahmad", "EE", "M", 1233, LocalDate.now(), 12);
		map.put(s1, "ABBA"); // -- hashcode--- collision 12334353
		map.put(s2, "Chabba"); // 1239998867
		System.out.println(map);
		
		s1.setName("Ahmad");

		System.out.println(map);

		// System.out.println(map.get(s1));
		System.out.println("================");
		System.out.println(s1);
		System.out.println(s2);
		// System.out.println(LocalDate.now());

		// System.out.println(map.size());

	}
}

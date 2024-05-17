package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import modal.Student;

public class ConvertListIntoMap {

	public static void main(String[] args) {
		List<Student> emp = new ArrayList<>();
		emp.add(new Student(1, "Rakesh"));
		emp.add(new Student(2, "Ramesh"));
		emp.add(new Student(3, "Rohan"));

		Map<Integer, String> map = new HashMap<>();

		for (Student s : emp) {
			map.put(s.getId(), s.getName());
		}
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println("------------------------------");
		
		emp.stream().collect(Collectors.toMap(Student::getId, Student::getName)).entrySet().iterator()
				.forEachRemaining(System.out::println);
		
		emp.stream().collect(Collectors.toMap(s -> s.getId(), s -> s, (e1, e2) -> e2, HashMap::new)).entrySet()
				.forEach(System.out::println);
	}
}

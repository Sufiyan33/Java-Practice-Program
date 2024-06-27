package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintStudentNameAge {

	/*
	 * Convert list into map
	 */
	public static void main(String[] args) {

		List<Student> studentList = getStudentList();
		Map<String, Integer> result = studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getAge, (oldValue, newValue) -> oldValue));
		System.out.println(result);
		
		for (Map.Entry<String, Integer> aa : result.entrySet())
			System.out.println("Key :: " + aa.getKey() + " | " + "value :: " + aa.getValue());
	}

	public static List<Student> getStudentList() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Anu", 23));
		list.add(new Student("Abbu", 30));
		list.add(new Student("Anu", 28));
		list.add(new Student("Anaj", 24));
		return list;
	}

}

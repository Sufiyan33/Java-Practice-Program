package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintStudentNameAge {

	public static void main(String[] args) {

		List<Student> studentList = getStudentList();
		Map<String, Integer> result = studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getAge, (oldValue, newValue) -> oldValue));
		System.out.println(result);
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

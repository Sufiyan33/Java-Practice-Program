package java_8_Interview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import modal.DataBase;
import modal.Employee;

public class EmployeeManagement {

	public static void main(String[] args) {
		List<Employee> list = DataBase.getAllEmployee();

		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		// OR
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		System.out.println(collect);

		list.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);

		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
				.entrySet().forEach(System.out::println);

		list.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
		// OR
		list.stream().sorted(Comparator.comparingDouble(e -> e.getSalary()))
				.max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
		// OR
		list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
				.ifPresent(System.out::println);

		// OR
		Employee emp = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
		System.out.println(emp);
	}
}

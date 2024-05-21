package java_8_Interview;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		
		list.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01))).map(e -> e)
				.forEach(System.out::println);

		list.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting())).entrySet()
				.forEach(System.out::println);
		
		list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(e -> e.getSalary())))
				.entrySet().forEach(System.out::println);

		list.stream().filter(e -> e.getGender() == "M" && e.getDepartment() == "CSE")
				.min(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);

		list.stream().sorted(Comparator.comparing(Employee::getDateofJoining)).findFirst()
				.ifPresent(System.out::println);
		// OR
		list.stream().min(Comparator.comparing(Employee::getDateofJoining)).ifPresent(System.out::println);

		list.stream().filter(e -> e.getDepartment() == "ME")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().forEach(System.out::println);

		Set<Map.Entry<String, List<Employee>>> entry = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment)).entrySet();

		for (Map.Entry<String, List<Employee>> itr : entry) {
			System.out.println("-------------------------");
			System.out.println("Employess in : " + itr.getKey() + " Department");
			System.out.println("-------------------------");

			for (Employee ee : itr.getValue()) {
				System.out.println(ee.getName());
			}
		}
		System.out.println("-------------------------");

		DoubleSummaryStatistics summaryStatistics = list.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average salary :: " + summaryStatistics.getAverage());
		System.out.println("Total Salary is :: " + summaryStatistics.getSum());

		Map<Boolean, List<Employee>> employeePartitions = list.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		System.out.println("Complete partition object : " + employeePartitions);
		System.out.println("Employee who are younger than or equal to 25 :: " + employeePartitions.get(Boolean.FALSE));
		System.out.println("Employee who are older than 25 :: " + employeePartitions.get(Boolean.TRUE));

		Employee em = list.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out
				.println("Name : " + em.getName() + ", Age : " + em.getAge() + ", Department : " + em.getDepartment());
	}
}

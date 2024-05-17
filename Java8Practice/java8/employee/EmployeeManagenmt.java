package employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import modal.DataBase;
import modal.Employee;

public class EmployeeManagenmt {

	public static void main(String[] args) {
		List<Employee> empList = DataBase.getAllEmployee();

		Map<String, Long> totalEmployee = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("total count is :: " + totalEmployee);

		empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		Map<String, Double> avrgAge = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		avrgAge.entrySet().stream().forEach(System.out::println);
		System.out.println(avrgAge);

		empList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(e -> System.out.println(e));
		empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
				.ifPresent(e -> System.out.println(e));

		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01))).map(Employee::getName)
				.forEach(System.out::println);

		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01)))
				.forEach(System.out::println);

		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet()
				.stream().forEach(System.out::println);

		empList.stream()
				.collect(
						Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().stream().forEach(System.out::println);

		empList.stream().filter(e -> e.getGender() == "M" && e.getDepartment() == "EE")
				.min(Comparator.comparingInt(Employee::getAge)).ifPresent(e -> System.out.println(e));

		empList.stream().min(Comparator.comparing(Employee::getDateofJoining)).map(Employee::getName)
				.ifPresent(e -> System.out.println(e));
		empList.stream().sorted(Comparator.comparing(Employee::getDateofJoining)).findFirst()
				.ifPresent(e -> System.out.println(e));

		empList.stream().filter(e -> e.getDepartment() == "ME")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet().stream()
				.forEach(System.out::println);

		empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().stream().forEach(System.out::println);

		Map<String, List<Employee>> mapData = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> itr = mapData.entrySet();
		for (Entry<String, List<Employee>> i : itr) {
			System.out.println("Employee in department :: " + i.getKey());
			List<Employee> e = i.getValue();
			for (Employee ee : e) {
				System.out.println(ee.getName());
			}
		}

		DoubleSummaryStatistics totalStatics = empList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average salary is :: " + totalStatics.getAverage());
		System.out.println("Total salary is :: " + totalStatics.getSum());

		empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25)).values().iterator().next()
				.forEach(System.out::println);
		Map<Boolean, List<Employee>> empLists = empList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		System.out.println("Partition objects are ---::");
		System.out.println("employee who are younger or equal to 25 are :: " + empLists.get(Boolean.FALSE));
		System.out.println("employee who are older than 25 are :: " + empLists.get(Boolean.FALSE));

		Employee emp = empList.stream().max(Comparator.comparing(Employee::getAge)).get();
		System.out.println("emp name :: " + emp.getName() + " emp age ::" + emp.getAge() + " emp department :: "
				+ emp.getDepartment());

		Employee SecondHighestSalary = empList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println("Second Highest Salary :: " + SecondHighestSalary.getSalary());
	}
}

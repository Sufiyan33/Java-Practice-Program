package employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import modal.DataBase;
import modal.Employee;

public class EmployeeQuery {

	public static void main(String[] args) {

		List<Employee> empList = DataBase.getAllEmployee();
		
		empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
				.entrySet().forEach(System.out::println);

		empList.stream().max(Comparator.comparingDouble(Employee::getSalary))
				.ifPresent(e -> System.out.print(e.getName()));
		Optional<Employee> collect = empList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(collect.get().getName());

		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01)))
				.forEach(e -> System.out.println(e.getName()));
		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01))).map(e -> e.getName())
				.forEachOrdered(System.out::println);

		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		empList.stream()
				.collect(
						Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().forEach(System.out::println);

		empList.stream().filter(e -> e.getDepartment() == "ME" && e.getGender() == "M")
				.min(Comparator.comparingInt(Employee::getAge))
				.ifPresent(System.out::println);

		empList.stream().min(Comparator.comparing(Employee::getDateofJoining)).ifPresent(System.out::println);
		empList.stream().sorted(Comparator.comparing(Employee::getDateofJoining)).findFirst()
				.ifPresent(System.out::println);
		empList.stream().sorted(Comparator.comparing(Employee::getDateofJoining)).findFirst()
				.ifPresent(e -> System.out.println(e.getName()));

		empList.stream().filter(e -> e.getDepartment() == "ME")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().forEach(System.out::println);
		
		Set<Entry<String, List<Employee>>> entrySet = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment))
				.entrySet();
		for(Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("Department name is :: " + entry.getKey());
			for (Employee e : entry.getValue()) {
				System.out.println("name is :: " + e.getName());
			}
		}

		DoubleSummaryStatistics total = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("average salary :: " + total.getAverage() + "total salary :: " + total.getSum());

		Employee employee = empList.stream().max(Comparator.comparing(Employee::getAge)).get();
		System.out.println(employee);
		System.out.println("age :: " + employee.getAge());
		System.out.println("Department :: " + employee.getDepartment());

		empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25)).values().iterator()
				.forEachRemaining(System.out::println);

		Map<Boolean, List<Employee>> part = empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		System.out.println("Complete partition objects :: " + part);
		System.out.println("Employee who are younger than or equal to 25 :: " + part.get(Boolean.FALSE));
		System.out.println("Employee who are greather than 25 :: " + part.get(Boolean.TRUE));

		empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findAny()
				.ifPresent(e -> System.out.println(e.getSalary()));

		Employee secMax = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println(secMax.getSalary());

		empList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst()
				.ifPresent(e -> System.out.println(e.getSalary()));

	}
}

package topJava8InterviewQuestions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeesManagement {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeDataBase.getAllEmployee();

		System.out.println("Question 1 : How many male and female employees are there in the organization? ");
		empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		// OR
		Map<String, Long> totalMaleAndFemale = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Total male and female :: " + totalMaleAndFemale);

		System.out.println("Question 2 : Print the name of all departments in the organization? ");
		empList.stream().map(e -> e.getDepartment()).forEach(System.out::println);
		// OR
		empList.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);

		System.out.println("Question 3 : What is the average age of male and female employees? ");
		empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
				.entrySet().forEach(System.out::println);
		// OR
		empList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingInt(e -> e.getAge())))
				.entrySet().forEach(System.out::println);

		System.out.println("Question 4 : Get the details of highest paid employee in the organization? ");
		empList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		// OR
		Employee employee = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("Max salary is :: " + employee.getSalary());
		// OR
		empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())))
				.ifPresent(System.out::println);
		// OR
		empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary()))).stream()
				.map(e -> e.getSalary()).forEach(System.out::println);

		System.out.println("Question 5 : Get the names of all employees who have joined after 2015? ");
		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01))).findAny()
				.ifPresent(e -> System.out.println(e.getName())); // it will give you only one record
		// OR
		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01))).map(e -> e.getName())
				.forEach(System.out::println);
		// OR
		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01))).map(e -> e.getName())
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Question 6 : Get the details of all employees who have joined after 2015? ");
		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01)))
				.forEach(System.out::println);
		// OR
		empList.stream().filter(e -> e.getDateofJoining().isAfter(LocalDate.ofYearDay(2015, 01)))
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Question 7 : Count the number of employees in each department? ");
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		System.out.println("Question 8 : What is the average salary of each department? ");
		empList.stream()
				.collect(Collectors.groupingBy(Employee::getSalary, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().forEach(e -> System.out.println(e.getValue()));

		System.out.println("Question 9 : Get the details of youngest male employee in the ME department? ");
		empList.stream().filter(e -> e.getGender() == "M" && e.getDepartment() == "ME")
				.min(Comparator.comparingInt(e -> e.getAge())).ifPresent(System.out::println);

		System.out.println("Question 10 : Who has the most working experience in the organization? ");
		empList.stream().min(Comparator.comparing(Employee::getDateofJoining)).ifPresent(System.out::println);

		// OR
		empList.stream().sorted(Comparator.comparing(Employee::getDateofJoining)).findFirst()
				.ifPresent(System.out::println);

		System.out.println("Question 11 : How many male and female employees are there in the CSE team? ");
		empList.stream().filter(e -> e.getDepartment() == "CSE").map(e -> e)
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		System.out.println("Question 12 : What is the average salary of male and female employees? ");
		empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(e -> e.getSalary())))
				.entrySet().forEach(System.out::println);
		// OR
		Iterator<Entry<String, Double>> iterator = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(e -> e.getSalary())))
				.entrySet().stream().iterator();
		System.out.println("Gender :: " + iterator.next().getKey() + " " + "Salary :: " + iterator.next().getValue());

		System.out.println("Question 13 : List down the names of all employees in each department? ");
		Iterator<Entry<String, List<Employee>>> itr = empList.stream().collect(Collectors.groupingBy(Employee::getName))
				.entrySet().stream().iterator();
		System.out.println("Name :: " + itr.next().getKey() + " " + " Departments :: "
				+ itr.next().getValue().iterator().next().getDepartment());
		// OR
		Map<String, List<Employee>> mapData = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> itr1 = mapData.entrySet();
		for (Entry<String, List<Employee>> i : itr1) {
			System.out.println("Employee in department :: " + i.getKey());
			List<Employee> e = i.getValue();
			for (Employee ee : e) {
				System.out.println(ee.getName());
			}
		}

		System.out.println("Question 14 : What is the average salary and total salary of the whole organization? ");
		DoubleSummaryStatistics salary = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average salary :: " + salary.getAverage() + " & " + "Total salary :: " + salary.getSum());

		System.out.println(
				"Question 15 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years. ");
		empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25)).entrySet()
				.forEach(System.out::println);
		// OR
		Map<Boolean, List<Employee>> empLists = empList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		System.out.println("employee who are younger or equal to 25 are :: " + empLists.get(Boolean.FALSE));
		System.out.println("employee who are older than 25 are :: " + empLists.get(Boolean.FALSE));

		System.out.println(
				"Question 16 : Who is the oldest employee in the organization? What is his age and which department he belongs to? ");
		Employee emp = empList.stream().max(Comparator.comparing(Employee::getAge)).get();
		System.out.println("Name :: " + emp.getName());
		System.out.println("Age :: " + emp.getAge());
		System.out.println("Departments :: " + emp.getDepartment());

		System.out.println("Question 17 : Find 2nd highest salary? ");
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst()
				.ifPresent(e -> System.out.println(e.getSalary()));
		// OR
		Employee secondSalary = empList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).skip(1).findFirst().get();
		System.out.println("2nd Highest Salary :: " + secondSalary.getSalary());

		System.out.println("Question 18 : Find 3rd highest salary? ");
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst()
				.ifPresent(e -> System.out.println(e.getSalary()));
		// OR
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).skip(2).findFirst()
				.ifPresent(e -> System.out.println(e.getSalary()));

		System.out.println("Question 19 : Count pairs of same color using Java 8? ");
		List<String> list = Arrays.asList("Black", "Green", "Red", "Green", "Yellow");
		long pairs = 0;
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (Map.Entry<String, Long> map : collect.entrySet()) {
			pairs += map.getValue() / 2;
		}
		System.out.println("Pairs of same colors :: " + pairs);

		System.out.println("Question 20 : Count pairs of same color using Java 8? ");
	}
}

package topJava8InterviewQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

		System.out.println("Question 2 : What is the average age of male and female employees? ");
		empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
				.entrySet().forEach(System.out::println);
		// OR
		empList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingInt(e -> e.getAge())))
				.entrySet().forEach(System.out::println);

		System.out.println("Question 2 : Get the details of highest paid employee in the organization? ");
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

		System.out.println("Question 2 : Get the names of all employees who have joined after 2015? ");
	}
}

package topJava8InterviewQuestions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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
		Employee secondSalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.limit(2).skip(1).findFirst().get();
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

		System.out.println("Question 20 : Check weather a given number Binary is Palindrome or not? ");
		int number = 1001;
		boolean isBinary = isBinaryPalindrome(number);
		System.out.println("Is binaryString Palindrome :: " + isBinary);

		boolean isBinaryPalindrome = isPalindrome(number);
		System.out.println("Is binaryString Palindrome :: " + isBinaryPalindrome);

		System.out.println("Question 21 : Find factorial of a number using Java8 ");
		int num = 10;
		long fact = LongStream.rangeClosed(1, num).reduce(1, (long x, long y) -> x * y);
		System.out.println("Factorial of a number is :: " + fact);

		System.out.println("Question 22 : Convert empList or List into Map using Java 8 ");
		empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName)).entrySet().iterator()
				.forEachRemaining(System.out::println);
		// OR, passing whole employee object
		empList.stream()
				.collect(Collectors.toMap(e -> e.getId(), e -> e, (oldValues, newValues) -> newValues, HashMap::new))
				.entrySet().forEach(System.out::println);

		System.out.println("Question 23 : Find Duplicate String And Count using Java 8 ");
		List<String> lis = Arrays.asList("Suresh", "Sabir", "Suresh");
		Set<String> set = new HashSet<>();
		lis.stream().filter(e -> !set.add(e)).forEach(System.out::println);
		// OR
		lis.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);
		// OR
		lis.stream().filter(e -> Collections.frequency(lis, e) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);

		System.out.println("Question 24 : Find Maximum number in the array using Java 8 ");
		int[] arr = { 1, 23, 4, 2, 22, 33, 11, 5, 9 };
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);

		System.out.println("Question 25 : Find Number Starting With one using Java 8 ");
		List<Integer> list1 = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list1.stream().map(e -> e + "").filter(e -> e.startsWith("1")).forEach(System.out::println);

		System.out.println("Question 26 : Check weather above list contains number starting with 1 using Java 8 ");
		list1.stream().map(e -> e + "").filter(e -> e.contains("1")).forEach(System.out::println);

		System.out.println("Question 27 : Find Only Duplicate Number And its count using Java 8 ");
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		names.stream().filter(e -> Collections.frequency(names, e) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);
		
		System.out.println("Question 28 : Find first non repeating character in string using Java 8 ");
		String input = "Java is Awesome";
		input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);
		
		System.out.println("Question 29 : Join string seprator using Java 8 ");
		List<String> str = Arrays.asList("Welcome", "to", "Java8");
		String joinStr = str.stream().map(String::valueOf).collect(Collectors.joining("-"));
		System.out.println("Joined string using separator :: " + joinStr);
		
		System.out.println("Question 30 : Perform Cube And Find Greatest Number using Java 8 ");
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		list2.stream().map(e -> e * e * e).filter(e -> e > 50).forEach(System.out::println);
		// OR
		list2.stream().map(e -> Math.pow(e, 3)).filter(e -> e > 50).forEach(System.out::println);

		System.out.println("Question 31 : Print date of next Tuesday using Java 8 ");
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next tueday date is :: " + date);

		System.out.println("Question 32 : Print Sum of all elements of array using Java 8 ");
		List<Integer> numbers = Arrays.asList(5, 4, 10, 12, 87, 33, 75);
		long totalSum = numbers.stream().mapToInt(e -> e).summaryStatistics().getSum();
		System.out.println("tatal sum of array number is :: " + totalSum);

		System.out.println("Question 33 : Find sum of two smallest number using Java 8 ");
		List<Integer> list3 = Arrays.asList(12, 2, 33, 23, 13, 11, 32);
		Integer twoSum = list3.stream().sorted(Comparator.naturalOrder()).limit(2).reduce(0, Integer::sum);
		System.out.println("Sum of two samllest number :: " + twoSum);

	}

	public static boolean isBinaryPalindrome(int number) {
		String binaryString = Integer.toBinaryString(number);
		System.out.println("Binary representations :: " + binaryString);
		return new StringBuilder(binaryString).reverse().toString().equals(binaryString);
	}

	public static boolean isPalindrome(int number) {
		String binarString = Integer.toBinaryString(number);

		return IntStream.range(0, binarString.length() / 2)
				.noneMatch(i -> binarString.charAt(i) != binarString.charAt(binarString.length() - i - 1));
	}
}

package java_8_Interview;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modal.DataBase;
import modal.Employee;

public class SortEmployeeData {

	/*
	 * Sort list of employee Data based on the some fields with various ways...
	 */
	public static void main(String[] args) {
		List<Employee> list = DataBase.getAllEmployee();

		// Method 1 :

		System.out.println("--- Method 1 : ---");
		Collections.sort(list, (e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
		// System.out.println(list);
		list.stream().forEach(System.out::println);

		// Method 2 :
		System.out.println("--- Method 2 : ---");
		list.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).forEach(System.out::println);

		System.out.println("--- Method 3 : ---");
		list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
	}
}

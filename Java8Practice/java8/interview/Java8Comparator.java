package interview;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modal.DataBase;
import modal.Employee;

public class Java8Comparator {

	public static void main(String[] args) {
		List<Employee> emp = DataBase.getAllEmployee();
		Comparator<Employee> thenComparing = Comparator.comparing(Employee::getId).thenComparing(Employee::getName);
		Collections.sort(emp, thenComparing);
	}
}

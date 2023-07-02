package interview;

import java.util.Comparator;
import java.util.List;

import modal.DataBase;
import modal.Employee;

public class SecondHighestSalary {

	public static void main(String[] args) {
		List<Employee> emp = DataBase.getAllEmployee();
		Employee secondHSalary = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println("Second Highest Salary :: " + secondHSalary.getSalary());
	}
}

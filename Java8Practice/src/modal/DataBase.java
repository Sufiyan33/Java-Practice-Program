package modal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getAllEmployee() {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(111, "Sufi", "CSE", "M", 123944, LocalDate.ofYearDay(2011, 11), 20));
		empList.add(new Employee(222, "Sabir", "CE", "M", 34352, LocalDate.ofYearDay(2017, 20), 30));
		empList.add(new Employee(333, "Alfaz", "EE", "M", 243244, LocalDate.ofYearDay(2010, 23), 40));
		empList.add(new Employee(444, "Abhisek", "CE", "M", 165444, LocalDate.ofYearDay(2008, 10), 29));
		empList.add(new Employee(888, "Neha", "ME", "F", 144564, LocalDate.ofYearDay(2007, 18), 28));
		empList.add(new Employee(555, "Amrit", "CE", "M", 17764, LocalDate.ofYearDay(2016, 15), 31));
		empList.add(new Employee(999, "Suresh", "ME", "M", 1454344, LocalDate.ofYearDay(2013, 30), 25));
		empList.add(new Employee(777, "Koushik", "ME", "M", 1878744, LocalDate.ofYearDay(2012, 23), 24));
		empList.add(new Employee(666, "Ibla", "CSE", "M", 128870, LocalDate.ofYearDay(2010, 12), 30));

		return empList;
	}
}

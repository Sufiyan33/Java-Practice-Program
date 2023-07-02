package interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import modal.DataBase;
import modal.Employee;

public class ConvertListToHashMapAndPassEmployeeAsValue {

	public static void main(String[] args) {
		List<Employee> list = DataBase.getAllEmployee();
		list.stream()
				.collect(Collectors.toMap(e -> e.getId(), e -> e, (oldValues, newValues) -> newValues, HashMap::new))
				.entrySet()
				.forEach(System.out::println);

		System.out.println("--------------------------------");

		Map<Integer, Employee> map = new HashMap<>();
		for (Employee ee : list) {
			map.put(ee.getId(), ee);
		}
		map.entrySet().forEach(System.out::println);
	}
}

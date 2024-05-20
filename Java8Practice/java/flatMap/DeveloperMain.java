package flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeveloperMain {

	public static void main(String[] args) {

		// Creating object
		Developer d1 = new Developer();
		// d1.setId(1);
		d1.setName("mk");
		d1.addBook("Java 8 in Action");
		d1.addBook("Spring Boot in Action");
		d1.addBook("Effective Java (3nd Edition)");

		Developer d2 = new Developer();
		// d2.setId(2);
		d2.setName("zilap");
		d2.addBook("Learning Python, 5th Edition");
		d2.addBook("Effective Java (3nd Edition)");

		// Add object in list
		List<Developer> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);

		// Let's flat the set.
		list.stream().map(e -> e.getBook()).flatMap(x -> x.stream()).filter(x -> !x.toLowerCase().contains("python"))
				.collect(Collectors.toSet()).forEach(System.out::println);

		// Here map is optional.
		list.stream().flatMap(e -> e.getBook().stream()).filter(e -> !e.toLowerCase().contains("python"))
				.collect(Collectors.toSet()).forEach(System.out::println);

	}
}

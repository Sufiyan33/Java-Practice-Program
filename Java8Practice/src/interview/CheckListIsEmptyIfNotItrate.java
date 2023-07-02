package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CheckListIsEmptyIfNotItrate {

	public static void main(String[] args) {

		List<String> notes = new ArrayList<>();
		notes.add("note1");
		notes.add("note2");
		notes.add("note3");
		notes.add("note4");
		notes.add("note5");
		
		Optional.ofNullable(notes)
		.orElseGet(Collections::emptyList)
		.stream()
		.filter(Objects::nonNull)
				.forEach(System.out::println);
	}

}

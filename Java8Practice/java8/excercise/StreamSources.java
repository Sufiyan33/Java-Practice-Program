package excercise;

import java.util.stream.Stream;

import modal.User;

public class StreamSources {

	public static Stream<String> stringNumbersStream() {

		return Stream.of("one", "Two", "Three", "four", "five", "six");
	}

	public static Stream<Integer> intNumberStream() {
		return Stream.iterate(0, i -> i + 2).limit(10);
	}
	
	public static Stream<User> userStream() {
		return Stream.of(new User(1, "Lionel", "Messi"), new User(2, "Sufiyan", "Ahmad"),
				new User(3, "Sabir", "Ansari"), new User(4, "Alfaz", "Raja"), new User(5, "Saket", "Dayalkar"),
				new User(6, "Abhisek", "Gupta"), new User(7, "Noway", "john"));
	}
}

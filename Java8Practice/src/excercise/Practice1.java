package excercise;

import modal.User;

public class Practice1 {

	public static void main(String[] args) {

		System.out.println("Print all numbers in intStream");
		StreamSources.intNumberStream().forEach(e -> System.out.println(e));
		StreamSources.intNumberStream().forEach(System.out::println);

		System.out.println("Print numbers from intStream that are < 5");
		StreamSources.intNumberStream().filter(e -> e < 5).forEach(e -> System.out.println(e));

		System.out.println("Print 2nd & 3rd numbers from intStream that are > 5");
		StreamSources.intNumberStream().filter(e -> e > 5).skip(1).limit(2).forEach(e -> System.out.println(e));

		System.out.println("Print 1st number from intStream that are > 5 if nothing is found print -1");
		Integer result = StreamSources.intNumberStream().filter(e -> e > 5).findFirst().orElse(-1);
		System.out.println(result);

		System.out.println("Print first names of all users from userStream");
		StreamSources.userStream().map(User::getFirtName).forEach(e -> System.out.println(e));
		StreamSources.userStream().map(e -> e.getFirtName()).forEach(e -> System.out.println(e));

		System.out.println("Print first names from userStream for users that have IDs from number stream");
		StreamSources.intNumberStream().flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
				.map(user -> user.getFirtName()).forEach(userName -> System.out.println(userName));
		
		System.out.println("----OR----");
		StreamSources.intNumberStream().flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
				.map(User::getFirtName).forEach(userName -> System.out.println(userName));

		System.out.println("----OR----");
		StreamSources.userStream().filter(u -> StreamSources.intNumberStream().anyMatch(i -> i == u.getId()))
				.forEach(System.out::println);

		System.out.println("----OR----");
		StreamSources.userStream().filter(u -> StreamSources.intNumberStream().anyMatch(i -> i == u.getId()))
				.forEach(u -> System.out.println(u.getFirtName()));

	}
}

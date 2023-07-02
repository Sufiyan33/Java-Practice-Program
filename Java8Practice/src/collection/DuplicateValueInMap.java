package collection;

import java.util.HashMap;

public class DuplicateValueInMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Sufiyan");
		map.put(1, "Sabir");
		map.put(2, "Alfaz");

		System.out.println(map);
	}
}

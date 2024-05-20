package java_8_Interview;

import java.util.HashMap;
import java.util.Map;

public class SortingMapData {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Sufiyan");
		map.put(2, "Tabish");
		map.put(1, "Alfaz");

		// Compare by key
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		// Compare by value
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}


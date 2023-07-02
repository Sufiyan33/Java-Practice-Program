package interview;

import java.util.HashMap;

public class CountWordInStringUsingHashMap {

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		String[] s = str.split(" ");

		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			if (map.containsKey(s[i])) {
				int count = map.get(s[i]);
				map.put(s[i], count + 1);
			} else {
				map.put(s[i], 1);
			}
		}
		System.out.println(map);
	}
}

package string;

import java.util.HashMap;
import java.util.Map;

public class DistinctAndCount {

	public static void main(String[] args) {
		String str = "abcdABCDabcd";
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char i : chars) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + i);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
	}
}

package string;

import java.util.HashMap;

public class FindLastNonRepeatedCharInStringUsingMap {

	public static void main(String[] args) {
		String input = "abcbcdefa";
		int count = 0;

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			Character currentChar = input.charAt(i);
			if (map.containsKey(currentChar)) {
				count = map.get(currentChar);
				count++;
				map.put(currentChar, count);
			} else {
				map.put(currentChar, 1);
			}
		}
		// Last non repeated character in string
		for (int i = input.length() - 1; i >= 0; i--) {
			Character chars = input.charAt(i);
			count = map.get(chars);
			if (count == 1) {
				System.out.println("Last non repeated character is :: " + chars);
				break;
			}
		}

		// first non repeated character in string
		for (int i = 0; i < input.length(); i++) {
			Character chars = input.charAt(i);
			count = map.get(chars);
			if (count == 1) {
				System.out.println("Fist non repeated character is :: " + chars);
				break;
			}
		}
	}
}

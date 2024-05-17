package string;

public class KthNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		int count = 0;
		int k = 3;
		char result = '\0';
		for(int i=0; i<str.length(); i++) {
			boolean repeating = false;

			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					repeating = true;
					break;
				}
			}
			if (!repeating) {
				count++;
				if (count == k) {
					result = str.charAt(i);
				}
			}
		}
		System.out.println("Kth non repeating character is :: " + result);
	}
}

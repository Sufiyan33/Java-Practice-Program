package string;

public class LastNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String input = "happy";
		final int MAX = 256;
		int freq[] = new int[MAX];

		for (int i = 0; i < input.length(); i++) {
			freq[input.charAt(i)]++;
		}

		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (freq[ch] == 1) {
				System.out.println("Last non repeated char is :: " + "" + ch);
				break;
			}
		}
	}
}

package string;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String input = "happy";

		for (char i : input.toCharArray()) {

			if (input.indexOf(i) == input.lastIndexOf(i)) {
				System.out.println("non repeating character is :: " + i);
				break;
			}
		}
	}
}

package interview;

public class FirstNonRepetedStringFromString {

	public static void main(String[] args) {
		String input = "My name is Sabir";
		for (int i = 0; i < input.length(); i++) {
			if (input.indexOf(i) != input.lastIndexOf(i)) {
				System.out.println("duplicate string :: " + i);
			}
		}
	}
}

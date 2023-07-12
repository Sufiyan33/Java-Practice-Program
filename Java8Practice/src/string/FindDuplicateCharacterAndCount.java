package string;

public class FindDuplicateCharacterAndCount {

	public static void main(String[] args) {
		int j = 1;
		String str = "manojpandey";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}
		// System.out.println("Duplicate char : " + ch[j] + "count is : " + count);
		/*
		 * Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(
		 * ), Collectors.counting())) .entrySet().forEach(System.out::println);
		 */
	}
}

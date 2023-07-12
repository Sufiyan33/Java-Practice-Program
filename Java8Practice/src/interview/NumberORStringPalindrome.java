package interview;

import java.util.Scanner;

public class NumberORStringPalindrome {

	public static void main(String[] args) {
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		String input = sc.nextLine();
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println("reverse is :: " + reverse);

		if (input.equals(reverse)) {
			System.out.println("String or number is Palindrom :: " + input + " , " + reverse);
		} else {
			System.out.println("String or number is not Palindrom :: " + input + " , " + reverse);
		}
	}
}

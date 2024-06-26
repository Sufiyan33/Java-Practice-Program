package interview_revision_questions;

import java.util.stream.IntStream;

public class FindNumberORStringIsPalindrom {

	/*
	 * Write a program to find whether a string or number is palindrome or not.
	 */
	public static void main(String[] args) {

		System.out.println("Number is Palindrom :: " + isPalindrom(1212));
		System.out.println("Number is Palindrom :: " + isPalindrom("banabv"));
	}

	public static boolean isPalindrom(int n) {
		/*
		 * String original = Integer.toString(n); String reversed = new
		 * StringBuilder(original).reverse().toString();
		 * 
		 * return original.equals(reversed);
		 */
		
		String str = Integer.toString(n);
		return IntStream.range(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
	}

	public static boolean isPalindrom(String n) {
		String str = String.valueOf(n);
		int length = str.length();

		boolean isPalidrom = IntStream.range(0, length / 2)
				.anyMatch(index -> str.charAt(index) == str.charAt(length - index - 1));

		return isPalidrom;
	}
}

package interview;

import java.util.stream.IntStream;

public class CheckStringBinaryPalindrome {

	public static void main(String[] args) {
		int number = 1001;
		boolean isBinary = isBinaryPalindrome(number);
		System.out.println("Is binaryString Palindrome :: " + isBinary);

		boolean isBinaryPalindrome = isPalindrome(number);
		System.out.println("Is binaryString Palindrome :: " + isBinaryPalindrome);

	}

	public static boolean isBinaryPalindrome(int number) {
		String binaryString = Integer.toBinaryString(number);
		System.out.println("Binary representations :: " + binaryString);
		return new StringBuilder(binaryString).reverse().toString().equals(binaryString);
	}

	public static boolean isPalindrome(int number) {
		String binarString = Integer.toBinaryString(number);

		return IntStream.range(0, binarString.length() / 2)
				.noneMatch(i -> binarString.charAt(i) != binarString.charAt(binarString.length() - i - 1));
	}
}

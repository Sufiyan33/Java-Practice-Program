package interview_revision_questions;

public class ArmstrongNumber {

	/*
	 * Write a Java Program to check Armstrong numbers.
	 * 
	 * 1 - First find the length then take power of each individual digits of len
	 * and at last do some.
	 */
	public static void main(String[] args) {

		System.out.println("Number is Armstrong :: " + isArmstrongNumber(729));
	}

	public static boolean isArmstrongNumber(int n) {
		int length = String.valueOf(n).length();
		
		int sum = String.valueOf(n).chars().map(ch -> Character.digit(ch, 10))
				.map(digit -> (int) Math.pow(digit, length))
				.sum();

		return sum == n;
	}
}

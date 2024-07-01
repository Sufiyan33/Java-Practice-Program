package interview_revision_questions;

import java.util.stream.IntStream;

public class FindPrimeNumber {

	/*
	 * Write a Java Program to find whether a number is prime or not.
	 */
	public static void main(String[] args) {

		System.out.println("Number is prime :: " + isNumberPrime(11));
	}

	private static boolean isNumberPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		
		if(n == 2) 
			return true;

		boolean isPrime = IntStream.rangeClosed(2, n / 2).noneMatch(e -> n % e == 0);
		return isPrime;
	}
}

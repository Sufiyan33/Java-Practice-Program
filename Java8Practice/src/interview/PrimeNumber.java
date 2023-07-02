package interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int num = input.nextInt();

		boolean flag = false;

		if (num == 0) {
			System.out.println("wrong input");
		}
		if (num == 2 || num == 1) {
			System.out.println("prime number");
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i != 0) {
				flag = true;
			} else {
				flag = false;
			}
		}

		if (flag == true) {
			System.out.println("prime number");
		} else {
			System.out.println(" not prime number");
		}

	}
}

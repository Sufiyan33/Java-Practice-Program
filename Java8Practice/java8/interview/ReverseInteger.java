package interview;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number :: ");
		int num = input.nextInt();

		int rev = 0, temp;
		while (num != 0) {
			temp = num % 10;
			rev = (rev * 10) + temp;
			num = num / 10;
		}

		System.out.println("reverse number is :: " + rev);
		input.close();
	}
}

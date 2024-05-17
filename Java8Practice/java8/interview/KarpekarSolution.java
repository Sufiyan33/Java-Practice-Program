package interview;

import java.util.HashSet;
import java.util.Set;

public class KarpekarSolution {
	public static int count = 0;
	
	public static void main(String[] args) {
		String number = "6174";
		int n = number.length();
		
		System.out.println(minimumStepToReachNumber(number, n));

	}

	public static String assedingOrder(String number) {
		char temp;
		char[] arr = number.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return new String(arr);
	}

	public static String descendingOrder(String number) {
		char temp;
		char[] arr = number.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return new String(arr);
	}

	public static boolean isNumberValid(String number, int n) {
		Set<Character> freq = new HashSet<>();
		for (int i = 0; i < n; i++) {
			freq.add(number.charAt(i));
		}
		return freq.size() >= 2 ? true : false;
	}

	public static int minimumStepToReachNumber(String number, int n) {
		if (!isNumberValid(number, n) || n > 4 && count == 0)
			return -1;
		else if (Integer.parseInt(number) == 6174)
			return count;

		count++;

		while (n++ < 4) {
			number = '0' + number.substring(1);
		}
		String updatedNumber = number;
		number = assedingOrder(number);
		updatedNumber = descendingOrder(updatedNumber);

		int increasing = Integer.parseInt(number);
		int decreasing = Integer.parseInt(updatedNumber);

		String string = Integer.toString(Math.abs(increasing - decreasing));

		return minimumStepToReachNumber(string, string.length());
	}
}

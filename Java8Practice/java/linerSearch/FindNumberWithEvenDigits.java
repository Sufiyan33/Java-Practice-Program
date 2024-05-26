package linerSearch;

public class FindNumberWithEvenDigits {

	/*
	 * Here, in the main task is to find out number with even digits. ex
	 * [12,123,1,23,12], here 12 has even digit number and 1 or 123 have odd digit
	 * numbers.
	 */
	// Approach :

	/*
	 * 1 : Count number of digits.
	 * 
	 * 2 : Convert number in string and find its length.
	 */

	public static void main(String[] args) {
		int[] arr = { 12, 345, 26, 6, 5, 7896, 23, 13, 10 };

		int evenDigits = findEvenDigits(arr);
		System.out.println("Even digits are :: " + evenDigits);
	}

	// Approach 2 :
	static int findEvenDigits(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			String num = arr[i] + "";
			int numLength = num.length();

			if (numLength % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}

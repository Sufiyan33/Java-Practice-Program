package string;

public class MaxAndMinValueOfArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 12, 10, 4, 5, 8, 2 };
		int min = arr[0];
		int max = arr[arr.length - 1];
		for (int a : arr) {
			if (a > max) {
				max = a;
			} else if (a < min && a != max) {
				min = a;
			}
		}

		System.out.println("max :: " + max + " min ::" + min);
		System.out.println("Sum :: " + (min + max));
		System.out.println("product :: " + (min * max));
	}
}

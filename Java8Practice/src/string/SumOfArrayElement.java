package string;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 12, 10, 4, 5, 8 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}

package linerSearch;

public class FIndMinimumNumber {

	public static void main(String[] args) {
		int[] arr = { 10, 1, 4, -2, 15, 16, 11, 12, 3 };
		System.out.println(min(arr));
	}

	static int min(int[] arr) {
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}
}

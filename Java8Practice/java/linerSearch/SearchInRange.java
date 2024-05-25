package linerSearch;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = { 1, 12, 13, 4, 21, 5, 16, 2, 24 };
		int start = 1;
		int end = 5;
		int target = 4;

		int result = searchInRange(arr, start, end, target);
		
		if (result == -1) {
			System.out.println("Number is not found within the range");
		} else {
			System.out.println("Number is found in the given range");
		}
		
	}

	public static int searchInRange(int[] arr, int start, int end, int target) {

		if (arr.length == 0)
			return -1;

		for (int i = start; i <= end; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}

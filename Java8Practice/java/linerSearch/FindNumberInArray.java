package linerSearch;

public class FindNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int key = 10;

		int result = searchNumber(arr, key);

		if (result == -1) {
			System.out.println("Number is not found");
		} else {
			System.out.println("number is found");
		}
	}

	public static int searchNumber(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}

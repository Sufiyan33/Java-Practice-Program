package linerSearch;

import java.util.Arrays;

public class SearchIn2Darray {

	public static void main(String[] args) {
		int[][] arr = {
				{ 1, 12, 13 }, { 2, 32, 12, 43 }, { 12, 23, 34 } };
		int target = 34;

		int[] result = searchTarget(arr, target);
		System.out.println("Target found at index : " + Arrays.toString(result));
	}

	static int[] searchTarget(int[][] arr, int target) {

		if(arr.length == 0)
			return new int[] { -1, -1 };
		
		for(int row= 0; row< arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	// Let's iterate array using forEach loop
	static int[] search(int[][] arr, int target) {

		if (arr.length == 0)
			return new int[] { -1, -1 };

		for (int[] ar : arr) {
			for (int as : ar) {
				if (as == target) {
					return new int[] { as };
				}
			}
		}

		return new int[] { -1, -1 };
	}
}

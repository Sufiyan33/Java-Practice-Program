package string;

public class MoveAllNegativeToBegning {

	public static void main(String[] args) {
		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		// Arrays.sort(arr);
		/*
		 * for (int i : arr) { // System.out.println(i + " "); }
		 */
		
		int j = 0, temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println("i and J are same : " + i + " " + j);
			}
			j++;
		}
		for (int b : arr) {
			System.out.println(b);
		}
	}
}

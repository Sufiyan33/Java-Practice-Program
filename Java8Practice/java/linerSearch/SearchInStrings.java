package linerSearch;

public class SearchInStrings {

	public static void main(String[] args) {
		String str = "college";
		char target = 'l';

		System.out.println(search(str, target));
		System.out.println(searchChar(str, target));
	}

	// here converting string into char array
	static boolean search(String str, char target) {

		char[] arr = str.toCharArray();

		if (arr.length == 0) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return true;
			}
		}
		return false;
	}

	static boolean searchChar(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}

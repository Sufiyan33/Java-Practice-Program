package string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverserString {

	public static void main(String[] args) {
		String s = "My name is sufiyan";
		char[] arr = s.toCharArray();
		StringBuilder append = null;
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			append = sb.append(arr[i]);
		}
		System.out.println(append.toString());
		
		System.out.println("-----------------------------");
		Stream.of(s).map(string -> new StringBuilder(string).reverse()).forEach(System.out::println);
		System.out.println("-----------------------------");

		StringBuilder st = new StringBuilder(s);
		String trim = st.reverse().toString().trim();
		System.out.println(trim);

		System.out.println("-----------------------------");
		String collect = Stream.of(s).map(str -> new StringBuilder(str).reverse()).collect(Collectors.joining());
		System.out.println(collect);
	}
}

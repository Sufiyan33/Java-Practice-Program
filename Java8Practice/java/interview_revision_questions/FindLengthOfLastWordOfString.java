package interview_revision_questions;

import java.util.Arrays;

public class FindLengthOfLastWordOfString {

	public static void main(String[] args) {
		String s = "Hello world";
		int length = Arrays.stream(s.split(" ")).reduce((first,second)->second).orElse("").length();
		System.out.println(length);
		
		//Another to this...
		s= s.strip();
		int len = 0;
		
		for(int i = s.length()-1; i>=0 && s.charAt(i) != ' '; i--) {
			len++;
		}
		System.out.println(len);
}
}

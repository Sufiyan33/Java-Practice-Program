package string;

public class StringExample {

	public static void main(String[] args) {
		String s = "Sufiyan";
		String a = s.concat("Ahmad");
		System.out.println("modified string is :: " + a + " ");
		
		System.err.println("-------------------------");

		String s1 = "Sabir";
		s1 = s1.concat("Ansair");
		System.out.println("Modify string is :: " + s1);

		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		System.out.println(sb.insert(2, "Ahmad"));
		System.out.println(sb.append(" abcd"));
		System.out.println(sb.delete(3, 5));

	}
}

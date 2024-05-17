package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<John> al = new ArrayList<>();
		al.add(new John(13, "Akf"));
		al.add(new John(12, "Mark"));
		al.add(new John(14, "Suf"));
		al.add(new John(12, "Mark"));


		Collections.sort(al);
		
		for(John j : al) {
			System.out.println(j);
		}
	}
}

package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(111, "Sufiyan");
		map.put(222, "Ahmad");
		map.put(333, "Wait");
		map.put(444, "Sabir");
		map.put(555, "Alfaz");

		Set<Integer> key = map.keySet();
		System.out.println(key);

		Collection<String> value = map.values();
		System.out.println(value);

		Set<Entry<Integer, String>> entry = map.entrySet();
		System.out.println(entry);

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> i = itr.next();
			System.out.println("Key is : " + i.getKey() + " & Value is : " + i.getValue());
		}
	}
}

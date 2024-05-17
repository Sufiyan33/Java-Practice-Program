package interview;

import java.util.HashMap;
import java.util.Map;

public class PrintValueFromMap {

	public static void main(String[] args) {

		Map<String, Double> mp = new HashMap<>();
		mp.put("Lenova", 34450.00);
		mp.put("Apple", 92500.00);
		mp.put("Toshiba", 53600.00);
		mp.forEach((k, v) -> System.out.println("Key : " + k + "Value : " + v));
	}

}

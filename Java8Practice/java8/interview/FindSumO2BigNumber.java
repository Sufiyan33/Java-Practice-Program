package interview;

import java.math.BigInteger;

public class FindSumO2BigNumber {
	public static void main(String[] args) {
		// add two Big number with new method
		String input1 = "12345678909876";
		String input2 = "12345678909876";

		String result = FindSumO2BigNumber.addTwoNumber(input1, input2);
		System.out.println(result);

	}

	public static String addTwoNumber(String str1, String str2) {
		BigInteger num1 = new BigInteger(str1);
		BigInteger num2 = new BigInteger(str2);
		BigInteger res = num1.add(num2);
		return res.toString();
	}
}

package test_knowledge;

import java.util.Arrays;

public class Test30 {

	/*
	 * Parse String into array and print data
	 */
	public static void main(String[] args) {
		String[] str = { "1", "2", "3", "new", "5" };

		Arrays.stream(str).filter(Test30::isInteger).mapToInt(Integer::parseInt).forEach(System.out::println);
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}

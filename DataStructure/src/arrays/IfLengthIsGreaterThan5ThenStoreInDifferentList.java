package arrays;

import java.util.ArrayList;
import java.util.List;

public class IfLengthIsGreaterThan5ThenStoreInDifferentList {
	/*
	 * If the length of string is greater than 5 then store in different list or
	 * array.
	 */
	public static void main(String[] args) {

		String[] arr = { "sachin", "Sourav", "Ankit", "Sufiyan", "Nazia", "Neel" };
		List<String> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			String ss = arr[i];
			int lengthOfString = ss.length();
			if (lengthOfString > 5) {
				list.add(ss);
			} else {
				arr[i] = arr[i];
			}
		}

		System.out.println("--- if greater than 5");
		for (String op : list) {
			System.out.println(op);
		}
	}
}

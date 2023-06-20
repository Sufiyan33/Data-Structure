package strings;

import java.util.Arrays;

public class CheckStringsAreAnagrams {

	public static void main(String[] args) {
		String s1 = "Hello".toLowerCase();
		String s2 = "lloeh".toLowerCase();

		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		int m = s1.length();
		int n = s2.length();

		if (n != m) {
			System.out.println("Length of Strings are not equal. Hence not anagrams");
		}

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		if (Arrays.equals(charArray1, charArray2) == true) {
			System.out.println("Strings are anagrams ...!!!");
		} else {
			System.out.println("Strings are not anagrams ...!!!");
		}

		// you can also use below for loop instead of above

		/*
		 * for (int i = 0; i < charArray1.length; i++) { if (charArray1[i] ==
		 * charArray2[i]) { System.out.println("String are anagrams"); } }
		 */

	}
}

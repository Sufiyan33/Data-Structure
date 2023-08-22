package recursion;

public class SkipCharInString {
	/*
	 * Skip a character in a given String using Recursion.
	 */
	// Approach.
	/*
	 * So here, Two ways to solve this issue :
	 * 
	 * 1 - By Passing ans variable in function as a parameter.
	 * 
	 * 2- Create ans variable in function body like what we did in ArrayList code
	 * (check out this Program FindTargetInArrayHavingDuplicateNumber).
	 */
	public static void main(String[] args) {
		skipString("", "baccadah");
		String ans = skipString("baccadah");
		System.out.println("answer =: " + ans);
	}

	// 1 : Passing as a method parameter.
	static void skipString(String ans, String str) {
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);

		if (ch == 'a') {
			skipString(ans, str.substring(1));
		} else {
			skipString(ans + ch, str.substring(1));
		}
	}

	// 1 : Creating ans variable in method body.
	static String skipString(String str) {
		if (str.isEmpty()) {
			return "";
		}

		char ch = str.charAt(0);

		if (ch == 'a') {
			return skipString(str.substring(1));
		} else {
			return ch + skipString(str.substring(1));
		}
	}
}

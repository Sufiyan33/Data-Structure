package recursion;

import java.util.ArrayList;

public class LetterCombinationOfPhoneNumber {

	/*
	 * 17. Letter Combinations of a Phone Number
	 */
	// approach.
	/*
	 * Basically we have to find out all the combinations when we press any key that
	 * how many combinations can be exist.
	 * 
	 * So let see, In any key pad 1 key consist of 3 letters for example key 1
	 * consist of a,b,c and similarly key 2 -> d,e,f. Now if you will press 1 & 2
	 * i.e 12 then possible combinations are : first take key 1 letter and
	 * alternative of key 2 and repeat same for key 2 and 1. Combinations are :
	 * ad,ae,af,bd,be,bf,cd,ce,cf.
	 * 
	 * when the the up-process string become empty then return answer and that is
	 * our base condition.
	 * 
	 * you can print are return answer as a list as well.
	 */

	public static void main(String[] args) {
		numPad("", "12");

		System.out.println();

		System.out.println(numPadReturnList("", "23"));

		System.out.println();

		System.out.println("Combintaions count is := " + numPadReturnCount("", "12"));
	}

	static void numPad(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		int digits = up.charAt(0) - '0'; // this will convert '2' into 2.

		for (int i = (digits - 1) * 3; i < digits * 3; i++) {
			char ch = (char) ('a' + i);
			numPad(p + ch, up.substring(1));
		}
	}

	// Now return combination as a list.
	static ArrayList<String> numPadReturnList(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return p == "" ? new ArrayList<>() : list;
		}

		int digits = up.charAt(0) - '0'; // this will convert '2' into 2.
		ArrayList<String> ans = new ArrayList<>();

		for (int i = (digits - 1) * 3; i < digits * 3; i++) {
			char ch = (char) ('a' + i);
			ans.addAll(numPadReturnList(p + ch, up.substring(1)));
		}
		return ans;
	}

	// Now return count of combinations.
	static int numPadReturnCount(String p, String up) {
		if (up.isEmpty()) {
			return 1;
		}
		int count = 0;
		int digits = up.charAt(0) - '0'; // this will convert '2' into 2.

		for (int i = (digits - 1) * 3; i < digits * 3; i++) {
			char ch = (char) ('a' + i);
			count = count + numPadReturnCount(p + ch, up.substring(1));
		}
		return count;
	}

}

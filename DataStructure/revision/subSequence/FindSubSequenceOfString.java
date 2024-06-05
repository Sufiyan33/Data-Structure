package subSequence;

import java.util.ArrayList;

public class FindSubSequenceOfString {

	/*
	 * find SubSequence of string. Example : abc => a,b,c,ab,ac,bc,abc
	 */
	public static void main(String[] args) {
		subSequence("", "abc");

		ArrayList<String> subSeq = subSequenceReturnList("", "abc");
		System.out.println(subSeq);

		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> result = subSequenceReturnList("", "123", list);
		System.out.println(result);
	}

	static void subSequence(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);

		subSequence(p + ch, up.substring(1));
		subSequence(p, up.substring(1));
	}

	// NOw return list after adding this.
	static ArrayList<String> subSequenceReturnList(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		char ch = up.charAt(0);

		ArrayList<String> left = subSequenceReturnList(p + ch, up.substring(1));
		ArrayList<String> right = subSequenceReturnList(p, up.substring(1));

		// Add one List into other and return any of them.
		left.addAll(right);
		return left;
	}

	static ArrayList<String> subSequenceReturnList(String p, String up, ArrayList<String> list) {
		if (up.isEmpty()) {
			list.add(p);
			return list;
		}

		char ch = up.charAt(0);

		subSequenceReturnList(p + ch, up.substring(1), list);
		subSequenceReturnList(p, up.substring(1), list);

		return list;
	}
}

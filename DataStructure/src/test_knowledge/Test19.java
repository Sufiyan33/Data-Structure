package test_knowledge;

import java.util.HashMap;

public class Test19 {

	/*
	 * Correct answer
	 */
	public static void main(String[] args) {

		String str = "aabcbf";
		// Output = a#bbcc
		System.out.println(findNonRepeaing(str));
	}

	static String findFirstNonRepeatingCharacter(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		char non_repeating = '#';
		for (char c : str.toCharArray()) {
			if (map.get(c) == 1) {
				non_repeating = c;
				break;
			}
		}

		StringBuilder output = new StringBuilder();
		boolean found = false;
		for (char c : str.toCharArray()) {
			if (c == non_repeating) {
				found = true;
				output.append(c);
			} else if (found && c != non_repeating) {
				output.append('#');
			} else {
				output.append(c);
			}
		}

		return output.toString();
	}

	static String findNonRepeaing(String str) {
		int[] charCount = new int[26];

		for (char c : str.toCharArray()) {
			charCount[c - 'a']++;
		}
		int firstNonRepeating = -1;
		for (int i = 0; i < str.length(); i++) {
			if (charCount[str.charAt(i) - 'a'] == 1) {
				firstNonRepeating = i;
				break;
			}
		}
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i < firstNonRepeating || charCount[str.charAt(i) - 'a'] > 1) {
				output.append(str.charAt(i));
			} else {
				output.append(str.charAt(firstNonRepeating));
			}
		}

		return output.toString();
	}
}

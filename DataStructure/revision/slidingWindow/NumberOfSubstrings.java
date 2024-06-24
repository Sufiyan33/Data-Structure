package slidingWindow;

public class NumberOfSubstrings {

	/*
	 * Number of Substrings Containing All Three Characters.
	 * 
	 * Example : bbacabc string contains all 3 char abc. Hence find substring which
	 * contain a,b,c char.
	 */

	public static void main(String[] args) {
		String str = "bbacba";

		// String str = "abcabc";

		System.out.println(subStringCount(str));
	}

	public static int subStringCount(String str) {

		int lastSeen[] = new int[] { -1, -1, -1 };
		int count = 0;
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			lastSeen[ch[i] - 'a'] = i;
			
			if (lastSeen[0] != -1) {
				count = count + (1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])));
				/*
				 * int minPosition = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
				 * count += minPosition + 1;
				 */
			}
		}
		return count;
	}
}

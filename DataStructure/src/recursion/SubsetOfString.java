package recursion;

public class SubsetOfString {
	/*
	 * Find subset of a given String.
	 */
	// Approach.
	/*
	 * Remember one thing whenever you see subset pattern problem then think of
	 * subset method.
	 * 
	 * Pattern of removing some elements or adding some elements known as subset
	 * pattern.
	 * 
	 * whenever string become empty then return and that is the base condition.
	 */

	public static void main(String[] args) {
		subset("", "abc");
	}

	static void subset(String ans, String str) {
		if (str.isEmpty()) {
			System.out.print(ans + " ");
			// System.out.print(ans);
			return;
		}

		char ch = str.charAt(0);
		// Remove an elements.
		subset(ans, str.substring(1));
		// Taking an elements.
		subset(ans + ch, str.substring(1));
	}
}

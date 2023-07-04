package arrays;

public class ProgramToFindPalindromInString {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";

		String str = s.toLowerCase();
		String ss = str.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println("Original String :: " + ss);
		char[] a = ss.toCharArray();

		StringBuilder rev = null;
		StringBuilder sb = new StringBuilder();
		for (int i = a.length - 1; i >= 0; i--) {
			rev = sb.append(a[i]);
		}
		String result = rev.toString();

		if (ss.equals(result))
			System.out.println(true);
		else
			System.out.println(false);
	}
}

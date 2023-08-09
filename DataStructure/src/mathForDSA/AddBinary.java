package mathForDSA;

public class AddBinary {
	/*
	 * 67. Add Binary :: https://leetcode.com/problems/add-binary/
	 */
	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		String ans = addBinary(a, b);
		System.out.println("Adding binary number =: " + ans);
	}

	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int i = a.length() - 1;
		int j = b.length() - 1;

		while (i >= 0 || j >= 0 || carry == 1) {
			if (i >= 0)
				carry += a.charAt(i--) - '0';
			if (j >= 0)
				carry += b.charAt(j--) - '0';
			sb.append(carry % 2);
			carry /= 2;
		}
		return sb.reverse().toString();
	}
}

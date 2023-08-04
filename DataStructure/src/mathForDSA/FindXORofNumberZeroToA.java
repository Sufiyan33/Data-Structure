package mathForDSA;

public class FindXORofNumberZeroToA {
	/*
	 * Find XOR of a number. Let say 9;
	 */
	// Approach.
	/*
	 * here what I am doing here, if you do 0^1 then output 1, o^o -> 0, 1^1 ->1.if
	 * you do this same till 9 or above then you will found that it is forming a
	 * pattern. After each 4 repetition it repeat the value. Hence Created below 4
	 * case;
	 */
	public static void main(String[] args) {
		int n = 5;
		int xor = findXor(n);
		System.out.println("XOR of number is := " + xor);
	}

	public static int findXor(int n) {
		// Case 1 :
		if (n % 4 == 0)
			return n;

		// Case 2 :
		if (n % 4 == 1)
			return 1;
		// Case 3 :
		if (n % 4 == 2)
			return n + 1;

		// Case : 4
		// if (n % 4 == 3) then return 0;

		return 0;
	}
}

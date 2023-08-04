package mathForDSA;

public class FindXORofAllElementsBetweenAandB {
	/*
	 * Here you have to find XOR in range. let say a = 3 and b = 9 then find all
	 * numbers XOR which are lies in between 3 and 9.
	 */
	// Approach.
	/*
	 * this program is relatable to program : FindXORofNumberZeroToA
	 * 
	 * Step 1 : find XOR from 1 to 9 let say f(b).
	 * 
	 * Step 2 : find XOR from 1 to 3 let say f(a).
	 * 
	 * Step 3 : now subtract for 1->9 to 1-> 3 means :: answer = f(b) ^ f(a-1);
	 */
	public static void main(String[] args) {
		int a = 3, b = 9;
		int ans = findXOR(b) ^ findXOR(a - 1);
		System.out.println(ans);
	}

	public static int findXOR(int n) {
		// Remember 4 rule which we discussed in findXOR of Number.
		if (n % 4 == 0)
			return n;

		if (n % 4 == 1)
			return 1;
		if (n % 4 == 2)
			return n + 1;

		return 0;
	}
}

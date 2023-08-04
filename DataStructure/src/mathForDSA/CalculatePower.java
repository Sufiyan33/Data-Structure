package mathForDSA;

public class CalculatePower {
	/*
	 * Here we need to find value of base a power b;
	 */
	// Approach.
	/*
	 * step 1 : find out the last digit where is it 0 or 1;
	 * 
	 * Step 2 : for step 1 do & operation.
	 * 
	 * Step 3 : post step 2 do right shift operation until you found 0;
	 */
	public static void main(String[] args) {
		int base = 3, power = 6;
		int ans = 1;
		while (power > 0) {
			// Check last digit
			if ((power & 1) == 1) {
				ans *= base;
			}
			base *= base;
			power = power >> 1;
		}
		System.out.println(ans);
	}
}

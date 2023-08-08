package mathForDSA;

public class HCF_LCF {
	/*
	 * Find HCF and LCF of a number.
	 * 
	 * HCF -> Highest common factor & LCF -> Lowest common factor.
	 */

	public static void main(String[] args) {
		System.out.println("HCF of number is := " + HCF(6, 18));
		System.out.println("LCF of number is := " + LCF(9, 27));
	}

	public static int HCF(int a, int b) {
		if (a == 0) {
			return b;
		}
		return HCF(b % a, a);
	}

	public static int LCF(int a, int b) {
		return (a * b) / HCF(a, b);
	}
}

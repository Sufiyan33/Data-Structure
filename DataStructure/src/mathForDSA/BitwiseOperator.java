package mathForDSA;

public class BitwiseOperator {
	/*
	 * Here we will write program for ALL bitwise operator(&, |, ^, ~).
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		System.out.println("a binary =: " + Integer.toBinaryString(a));
		System.out.println("b binary =: " + Integer.toBinaryString(b));

		System.out.println(" a&b :: " + (a & b));
		System.out.println(" aIb :: " + (a | b));
		System.out.println(" a^b :: " + (a ^ b));
		System.out.println(" a~b :: " + (~a));
		System.out.println(" a~b :: " + (~b));
	}
}

package test_knowledge;

public class Test16 {

	/*
	 * I have 4 coins, each of which costs 34.34, Can you please calculate total?
	 * Find sum of all number in string if no number then print 0.
	 */
	public static void main(String[] args) {
		String ss = "34.34";
		double string = sumOfNumbersInString(ss);
		System.out.println(string);
	}

	public static double sumOfNumbersInString(String s) {
		double sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				sum += Character.getNumericValue(s.charAt(i));
			}
		}
		return sum;
	}

}

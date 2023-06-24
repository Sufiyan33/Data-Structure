package linearSearch;

public class FindEvenDigitsInIntegerArray {

	public static void main(String[] args) {
		int[] arr = { 12, 345, 6, 2, 7896, 23, 45 };
		int evenDigit = findNumber(arr);
		System.out.println("Even Digits are :: " + evenDigit);
	}

	static int findNumber(int[] arr) {
		int count = 0;
		for (int aa : arr) {
			if (even(aa)) {
				count++;
			}
		}
		return count;
	}

	static boolean even(int num) {
		int findDigit = digit(num);

		return findDigit % 2 == 0;
	}

	static int digit(int num) {

		if (num == 0)
			return -1;

		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}

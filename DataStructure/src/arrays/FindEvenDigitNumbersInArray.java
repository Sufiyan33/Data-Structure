package arrays;

public class FindEvenDigitNumbersInArray {

	public static void main(String[] args) {
		int[] arr = { 12, 345, 6, 2, 7896, 124, 22 };

		System.out.println("Even digits are :: " + findNumber(arr));
	}

	static int findNumber(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (findEven(num)) {
				count++;
			}
		}
		return count;
	}

	static boolean findEven(int num) {
		int numberOfDigits = countDigits(num);
		if (numberOfDigits % 2 == 0) {
			return true;
		}
		return false;
	}

	static int countDigits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}

package arrays;

public class FindEvenDigitNumbersInArray {

	public static void main(String[] args) {
		int[] arr = { 12, 345, 6, 2, 7896, 124, 22 };

		System.out.println("1");
		System.out.println(findNumber(arr));
	}

	static int findNumber(int[] arr) {
		System.out.println("2");
		int count = 0;
		for (int num : arr) {
			if (findEven(num)) {
				System.out.println("5");
				count++;
			}
		}
		return count;
	}

	static boolean findEven(int num) {
		System.out.println("3");
		int numberOfDigits = countDigits(num);
		System.out.println("5");
		if (numberOfDigits % 2 == 0) {
			System.out.println("6");
			return true;
		}
		return false;
	}

	static int countDigits(int num) {
		System.out.println("4");
		int count = 0;
		while (num > 0) {
			count++;
			num = num % 2;
		}
		return count;
	}
}

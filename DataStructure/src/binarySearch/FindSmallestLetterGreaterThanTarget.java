package binarySearch;

public class FindSmallestLetterGreaterThanTarget {

	/*
	 * Leetcode problem. it is very similar to ceiling of number but the difference
	 * is here we need to find out only greater element not equal. 2nd difference is
	 * letter are wrap around means if number is not found then return 0th index
	 * value. for the same you can do start % length of array.
	 */

	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';
		// char target = 'j';
		// char target = 'f';
		// char target = 'c';
		// char target = 'z';
		int index = findSmallestLetter(letters, target);
		System.out.println("index of taget is :: " + index);
	}

	public static int findSmallestLetter(char arr[], char target) {
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target >= arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if (start == arr.length) {
			int dex = start % arr.length;
			return dex;
		}
		return start;
		/*
		 * you can also return directly arr[start % arr.length], instead of last check.
		 * I will add another solution.
		 */

	}
}

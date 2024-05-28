package binarySearch;

public class FindSmallestLetterThanTarget {

	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';
		char result = findLetter(letters, target);

		System.out.println(result);
	}

	static char findLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > letters[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return letters[start % letters.length];
	}
}

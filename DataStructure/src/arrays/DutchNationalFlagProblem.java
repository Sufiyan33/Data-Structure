package arrays;

public class DutchNationalFlagProblem {

	/*
	 * this also known as :: Sort an array of 0s, 1s and 2s the concept is put all
	 * 0's then 1's and 2's in the array.
	 */
	/*
	 * Idea to solve is :: Count the number of 0s, 1s, and 2s in the given array.
	 * Then store all the 0s at the beginning followed by all the 1s and then all
	 * the 2s.
	 */
	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		int i, countZero = 0, countOne = 0, countTwo = 0;
		// count 0's, 1's, 2's using switch & for loop
		for (i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case 0:
				countZero++;
				break;
			case 1:
				countOne++;
				break;
			case 2:
				countTwo++;
				break;
			}
		}
		i = 0;
		while (countZero > 0) {
			arr[i++] = 0;
			countZero--;
		}
		while (countOne > 0) {
			arr[i++] = 1;
			countOne--;
		}
		while (countTwo > 0) {
			arr[i++] = 2;
			countTwo--;
		}

		for (int aa : arr) {
			System.out.println(aa);
		}
	}
}

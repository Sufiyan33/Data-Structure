package arrays;

public class MoveAllZeroInStartAndOneInTheLastInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 0, 0, 3, 6 };

		int countZero = 0;
		int flagForOne = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1) {
				arr[flagForOne++] = arr[i];
			}
		}
		// moving 1 at the last
		while (flagForOne < arr.length) {
			arr[flagForOne++] = 1;
		}

		// now pull all zero to start;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 0)
				continue;
			if (countZero == 0) {
				countZero = i;
			}
			if (arr[i] != 0) {
				arr[countZero--] = arr[i];
			}
		}
		// move all zero to starting;
		while (countZero >= 0) {
			arr[countZero--] = 0;
		}

		for (int aa : arr) {
			System.out.println(aa);
		}
	}
}

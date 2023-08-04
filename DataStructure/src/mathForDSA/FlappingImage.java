package mathForDSA;

import java.util.Arrays;

public class FlappingImage {
	/*
	 * Flapping image LeetCode Problem.
	 */
	// Approach
	/*
	 * Step 1 : Reverse array and then find out XOR. you will get answer.
	 */
	public static void main(String[] args) {
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		// outPut : { { 1, 0,0 }, { 0, 1, 0 }, { 1,1,1 } };
		int[][] flipped = flappingImages(image);

		for (int[] row : flipped) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static int[][] flappingImages(int[][] image) {
		for (int[] row : image) {
			// Reverse array.
			for (int i = 0; i < (image[0].length + 1) / 2; i++) {
				int temp = row[i] ^ 1;
				row[i] = row[image[0].length - i - 1] ^ 1;
				row[image[0].length - i - 1] = temp;
			}
		}
		return image;
	}
}

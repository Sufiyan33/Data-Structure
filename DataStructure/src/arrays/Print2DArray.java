package arrays;

import java.util.Scanner;

public class Print2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 5, 7, 9 } };
		/*
		 * for (int row = 0; row < arr.length; row++) { for (int col = 0; col <
		 * arr[row].length; col++) { arr[row][col] = sc.nextInt(); } }
		 */
		System.out.println("Entered number is :: " + sc);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println(arr[row][col] + " ");
			}
		}
		sc.close();
	}
}

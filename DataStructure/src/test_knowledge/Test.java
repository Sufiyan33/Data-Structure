package test_knowledge;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		short x = 10;
		x = (short) (x * 5); // you must do type casting.
		System.out.println(x);

		System.out.println("------Print ASCII value-------");

		char ch = 'a';
		System.out.println(ch + 0);

		String str = "abc";
		for (int i = 0; i < str.length(); i++) {
			int digit = str.charAt(i) - '0';
			System.out.println(digit);
		}

		byte xy = 127;
		xy++;
		xy++;
		System.out.print(xy);

		System.out.println("--------neww-----------");
		int[] arr = { 0, 2, 4, 1, 3 };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[(arr[i] + 3) % arr.length];
			System.out.println(arr[i]);
		}

		// ----------------------------------------
		int[] ar = { 120, 200, 016 };
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println(Integer.toBinaryString(022));
		// ----------------------------------------

		System.out.println("<--------------------------->");

		int ans = function(1, 1, 1);
		System.out.println("Result is " + ans);

		System.out.println("Floor =: " + Math.floor(3.6));

		int aar[] = new int[2];
		System.out.println(aar[0]);
		System.out.println(aar[1]);

		{
			int arr1[] = { 1, 2, 3 };
			int arr2[] = { 1, 2, 3 };
			if (arr1 == arr2)
				System.out.println("Same");
			else
				System.out.println("Not same");
		}

		List<Integer> n = Arrays.asList(1, 2, 3, 4, 5);
		int sum = n.stream().filter(a -> a % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("result :: = " + sum);

		System.out.println("-------------------------------");
		Double object = new Double("2.4");
		int a = object.intValue();
		byte b = object.byteValue();
		float d = object.floatValue();
		double c = object.doubleValue();

		System.out.println(a + b + c + d);
		System.out.println("------------------------");

		out.println("GeeksforGeeks");

	}

	public static int function(int... a) {
		int sum = 0;
		for (int i : a)
			sum += i;
		return sum;
	}
}

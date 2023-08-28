package test_knowledge;

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

		System.out.println("<--------------------------->");

		int ans = function(1, 1, 1);
		System.out.println("Result is " + ans);
	}

	public static int function(int... a) {
		int sum = 0;
		for (int i : a)
			sum += i;
		return sum;
	}
}

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
	}
}

package test_knowledge;

public class Test12 {

	public static void main(String[] args) {
		demo(1234);
	}

	public static void demo(int x) {
		System.out.print(x % 10);
		if (x % 10 != 0) {
			demo(x / 10);
		}
		System.out.print(x % 10);
	}
}

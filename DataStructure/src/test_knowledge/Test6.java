package test_knowledge;

public class Test6 {
	static int method(int i) {
		System.out.println(i + " ");
		return i;
	}

	public static void main(String[] args) {
		int i = 1;
		method(method(++i) + method(i++) + (-i) + method(i++));
	}
}

package test_knowledge;

public class Test6 {

	static int m(int i) {
		System.out.println(i + " ");
		return i;
	}

	public static void main(String[] args) {

		int i = 1;
		m(m(++i) + m(i++) + (-i) + m(i++));
	}
}

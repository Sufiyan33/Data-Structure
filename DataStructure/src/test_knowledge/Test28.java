package test_knowledge;

public class Test28<T> {

	T t;
	int a;

	public <T> void print() {
		System.err.println("T :: " + t);
		System.err.println("a :: " + a);
	}

	public static void main(String[] args) {
		Test28<Integer> test = new Test28<>();
		test.t = 20;
		test.a = 10;
		test.print();
	}
}

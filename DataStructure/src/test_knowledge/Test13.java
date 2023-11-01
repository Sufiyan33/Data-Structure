package test_knowledge;

public class Test13 {

	private int num = 175;

	class inner_Demo {
		public int getNum() {
			return num;
		}
	}
}

class Terr {
	public static void main(String[] args) {
		Test13 t = new Test13();
		// Test13.inner_Demo inner = t.inner_Demo(); it will show compile time error.
		// System.out.println(inner.getNum());
	}
}

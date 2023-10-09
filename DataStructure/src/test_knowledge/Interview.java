package test_knowledge;

public class Interview {

	public static void main(String[] args) {
		Box b = new Box();
		b.width = 10;
		b.height = 2;
		b.length = 10;

		int y = b.width * b.height * b.length;
		System.out.println(y);
	}
}

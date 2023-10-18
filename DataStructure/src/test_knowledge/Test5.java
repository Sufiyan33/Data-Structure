package test_knowledge;

public class Test5 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("123456789");
		sb = sb.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");

		StringBuilder sb1 = new StringBuilder("123456789");
		sb1 = sb1.delete(0, 3).replace(1, 3, "24").delete(4, 6);
		System.out.println(sb);

		boolean x = (sb1.equals(sb));
		System.out.println(x);
	}
}

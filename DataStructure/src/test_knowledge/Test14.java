package test_knowledge;

public class Test14 {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "abcd";
		String s3 = "abcd" + "ef";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		sample s = new sample();
		s.x = 20;
		sample s5 = new sample();
		s5.x = 30;

		System.out.println("value of x:: " + s.x);

	}

}

class sample {
	static int x = 10;
}

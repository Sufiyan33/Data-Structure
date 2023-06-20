package strings;

public class RerverseString {

	public static void main(String[] args) {
		String str = "plehgnitseterawtfos";

		StringBuilder sb = new StringBuilder(str);
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);
	}
}

package strings;

public class ReverseWordsInGivenString {

	public static void main(String[] args) {
		String s = "i like this program very much ";
		StringBuilder sb = new StringBuilder(s);
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);
	}
}

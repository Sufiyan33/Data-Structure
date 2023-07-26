package strings;

public class PrintAllAlphabetofEnglish {
	/*
	 * a,b,c,d,----- z.
	 */
	public static void main(String[] args) {
		System.out.println("Alphabets are =:: ");
		for (int i = 0; i < 26; i++) {
			char alphabet = (char) ('a' + i);
			System.out.println(alphabet);
		}
	}

}

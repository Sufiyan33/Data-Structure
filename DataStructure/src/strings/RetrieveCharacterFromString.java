package strings;

public class RetrieveCharacterFromString {

	public static void main(String[] args) {
		String input = "HeyCoders";

		char position = input.charAt(2);
		System.out.println(position);

		for (int i = 0; i < input.length(); i++) {
			char charAt = input.charAt(i);
			System.out.println("The char is :: " + charAt);
		}
	}
}

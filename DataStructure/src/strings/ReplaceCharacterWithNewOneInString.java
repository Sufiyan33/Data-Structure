package strings;

public class ReplaceCharacterWithNewOneInString {

	public static void main(String[] args) {
		String s = "Shoot";

		String rep = s.replace('o', 'u');
		System.out.println("Replaced character is :: " + rep);

		String repFirst = s.replaceFirst(rep, "o");
		System.out.println("Replace first char :: " + repFirst);
	}
}

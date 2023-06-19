package strings;

public class ProgramConvertStringIntoCharArray {

	public static void main(String[] args) {
		String input = "HeySufiyanHowAreyou";
		char[] charArray = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			System.out.println("char array is :: " + charArray[i]);
		}
	}
}

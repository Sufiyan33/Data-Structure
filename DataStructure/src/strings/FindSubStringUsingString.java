package strings;

public class FindSubStringUsingString {

	public static void main(String[] args) {
		String str = "MaIN";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (Character.isUpperCase(str.charAt(i)) && Character.isUpperCase(str.charAt(j))) {
					System.out.println(str.substring(i, j + 1));
				}
			}
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
	}
}

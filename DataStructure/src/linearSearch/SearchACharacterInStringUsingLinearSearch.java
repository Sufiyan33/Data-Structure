package linearSearch;

public class SearchACharacterInStringUsingLinearSearch {

	public static void main(String[] args) {
		String str = "sufiyan";
		char target = 'u';
		boolean flag = search(str, target);
		System.out.println("is character present :: " + flag);
	}

	static boolean search(String str, char target) {
		if (str.length() == 0)
			return false;

		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}

package strings;

public class FindFirstAndLastIndexOfString {

	public static void main(String[] args) {
		String str = "Saket Saurav " + "performing a search";
		System.out.println("Index of S is :: " + str.indexOf("S"));
		System.out.println("Index of S is :: " + str.indexOf("e"));

		System.out.println("Index of S is :: " + str.lastIndexOf("S"));
	}
}

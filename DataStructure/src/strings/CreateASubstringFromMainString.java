package strings;

public class CreateASubstringFromMainString {

	public static void main(String[] args) {
		String str = "HeyILoveYouDoYouAlso";

		String sub = str.substring(3, 8);
		System.out.println(sub);

		String sub1 = str.substring(10);
		System.out.println(sub1);
	}
}

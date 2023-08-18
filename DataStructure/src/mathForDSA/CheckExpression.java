package mathForDSA;

public class CheckExpression {

	public static void main(String[] args) {
		float a = 35; // Case : 1
		System.out.println("Answer :: " + a / 0);

		float b = 35f; // Case : 1
		System.out.println("Answer :: " + b / 0);

		float f = 35f / 0;
		System.out.println("Answer :: " + f);

		float ff = 35 / 0;
		System.out.println("Answer :: " + ff);

		// Below expression will give compilation issue
		// for(int i = 99; i>=0; i/9) {}
	}
}

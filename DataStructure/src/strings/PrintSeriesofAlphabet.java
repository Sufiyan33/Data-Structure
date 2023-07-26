package strings;

public class PrintSeriesofAlphabet {

	/*
	 * abcdefgh------xyz.
	 */

	public static void main(String[] args) {
		String series = "";
		for (int i = 0; i < 26; i++) {
			char alp = (char) ('a' + i);
			series += alp;
		}
		System.out.println(series);
	}
}

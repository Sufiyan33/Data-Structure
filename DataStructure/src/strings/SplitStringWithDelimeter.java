package strings;

public class SplitStringWithDelimeter {

	public static void main(String[] args) {
		String str = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";

		String[] splitObject = str.split("xyz");
		for (String s : splitObject) {
			System.out.println(s);
		}
	}
}

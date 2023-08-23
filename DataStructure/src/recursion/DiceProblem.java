package recursion;

import java.util.ArrayList;

public class DiceProblem {

	/*
	 * To find the combination of a number let say 4. It means we can take : 3 & 1
	 * or 2 & 2 or 1111 or 4 itself etc.
	 * 
	 * So here, target is 4 and dice face is 6 means loop will run from 1 till 6.
	 * 
	 * We have to make combination or count until target become zero and once target
	 * is return or terminate recursive call.
	 */
	public static void main(String[] args) {
		dice("", 4);

		System.out.println();

		System.out.println(diceReturnList("", 4));

		System.out.println();

		System.out.println("Count of all combinations to make it 4 are := " + diceReturnCount("", 4));

		System.out.println("Dice have 8 face := ");
		diceFace("", 5, 8);
	}

	// Print All combination to make 4.
	static void dice(String p, int target) {
		if (target == 0) {
			System.out.println(p);
			return;
		}

		for (int i = 1; i <= 6 && i <= target; i++) {
			dice(p + i, target - i);
		}
	}

	// Return All combination to make 4 as a List.
	static ArrayList<String> diceReturnList(String p, int target) {
		if (target == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		for (int i = 1; i <= 6 && i <= target; i++) {
			ans.addAll(diceReturnList(p + i, target - i));
		}
		return ans;
	}

	// Return count of All combination to make 4.
	static int diceReturnCount(String p, int target) {
		if (target == 0) {
			return 1;
		}
		int count = 0;
		for (int i = 1; i <= 6 && i <= target; i++) {
			count = count + diceReturnCount(p + i, target - i);
		}
		return count;
	}

	// What if dice has 7 or 8 face then how to make combinations.
	static void diceFace(String p, int target, int face) {
		if (target == 0) {
			System.out.println(p);
			return;
		}

		for (int i = 1; i <= face && i <= target; i++) {
			diceFace(p + i, target - i, face);
		}
	}
	// Similarly you can also write code to return as a list and count as well.
}

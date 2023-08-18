package recursion;

public class MinimumMovesToReachTargetScore {
	/*
	 * 2139. Minimum Moves to Reach Target Score
	 */

	public static int minMoves(double target, int maxDoubles) {
		return helper(target, maxDoubles, 0);
	}

	// This condition need to be fix.
	static int helper(double target, int maxDoubles, int moves) {
		if (target == 0) {
			return moves;
		}
		if (maxDoubles == 0) {
			return moves += target;
		}
		target = Math.ceil(target / 2);
		maxDoubles--;
		moves++;
		return helper(target, maxDoubles, moves);

	}

	public static void main(String[] args) {
		int moves = minMoves(10, 4);
		System.out.println("moves are =: " + moves);
	}
}

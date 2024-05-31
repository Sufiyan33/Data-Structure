package recursion;

public class Concept {

	/*
	 * Here, we will understand the main important concept...
	 * 
	 * Case 1 : n--;
	 * 
	 * Case 2 : --n;
	 */

	public static void main(String[] args) {
		print(5);
	}

	static void print(int n) {
		if (n == 0)
			return;

		System.out.println(n);
		/*
		 * Case 1 : if you call below function then n-- means first assign value then
		 * subtract it from number when function is over. So it will print 5 again it
		 * will print 5 because function is not yet over hence it didn't decremented
		 * value. So the output is => StackOverflow exception.
		 */
		// print(n--);

		/*
		 * Case 2 : In case of --n, it will first subtract value then assign. Hence it
		 * will pass 5 then next call pass 4 and so on. Hence the result is =>
		 * 5,4,3,2,1;
		 */
		print(--n);
	}
}

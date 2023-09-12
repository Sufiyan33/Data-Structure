package stack;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
	/*
	 * 921. Minimum Add to Make Parentheses Valid
	 */
	// Approach
	/*
	 * Step 1 : first check if open brackets are in stack and inserting parenthesis
	 * is also opening then simply push in stack.
	 * 
	 * Step 2 : if this is not the case then simply pop it from stack.
	 * 
	 * Step 3 : whatever the remaining parenthesis are stack those number of
	 * parenthesis are require to make it valid. Hence return stack size.
	 */

	public static void main(String[] args) {
		// String s = "())";

		String s = "(((";
		int min = minAddToMakeValid(s);
		System.out.println("min Add to make valid := " + min);
	}

	public static int minAddToMakeValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					stack.push(ch);
				}
			} else {
				stack.push(ch);
			}
		}
		return stack.size();
	}
}

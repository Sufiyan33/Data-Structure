package stack;

import java.util.Stack;

public class MinimumInsertionstoBalanceAParenthesesString {

	/*
	 * 1541. Minimum Insertions to Balance a Parentheses String
	 */
	// Approach
	/*
	 * If two closing braces came together then pop it from stack.
	 * 
	 * 1- Take a counter, initially it is zero.
	 * 
	 * 2- if '(' this came then insert in stack.
	 * 
	 * 3- if ')' came then check if next of current is closing if this is the case
	 * then skip it otherwise increase count.
	 * 
	 * 4- check if stack isEmpty, Yes then increase count otherwise pop brackets.
	 */
	public static void main(String[] args) {
		String s = "(()))";
		// String s = "())";
		int min = minInsertions(s);
		System.out.println("min Insertions := " + min);
	}

	public static int minInsertions(String s) {

		Stack<Character> stack = new Stack<>();
		int countBrackets = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {
				if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
					i++;
				} else {
					countBrackets++;
				}

				if (!stack.isEmpty()) {
					stack.pop();
				} else {
					countBrackets++;
				}
			}
		}
		countBrackets += 2 * stack.size();
		return countBrackets;
	}
}

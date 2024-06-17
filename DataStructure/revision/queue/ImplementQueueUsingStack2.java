package queue;

import java.util.Stack;

public class ImplementQueueUsingStack2 {

	/*
	 * Solution 2: Using two Stacks where push operation is O(1).
	 */

	private Stack<Integer> first;
	private Stack<Integer> second;

	public ImplementQueueUsingStack2() {
		first = new Stack<>();
		second = new Stack<>();
	}

	void push(int items) {
		while (!first.isEmpty()) {
			second.push(first.pop());
		}

		first.push(items);

		while (!second.isEmpty()) {
			first.push(second.pop());
		}
	}

	public int peek() {
		return first.peek();
	}

	public int remove() {
		return first.pop();
	}

	public static void main(String[] args) {
		ImplementQueueUsingStack2 stack = new ImplementQueueUsingStack2();

		stack.push(5);
		stack.push(6);
		stack.push(4);
		stack.push(3);
		stack.push(8);

		System.out.println(stack.remove());
		System.out.println(stack.remove());
		System.out.println(stack.peek());
	}

}

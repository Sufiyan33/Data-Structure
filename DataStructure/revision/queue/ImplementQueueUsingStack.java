package queue;

import java.util.Stack;

public class ImplementQueueUsingStack {

	/*
	 * Here, we are going to implement queue using stacks. So do this, I need two
	 * stack to perform operations.
	 */

	private Stack<Integer> first;
	private Stack<Integer> second;

	public ImplementQueueUsingStack() {
		first = new Stack<>();
		second = new Stack<>();
	}

	void push(int items) {
		first.push(items);
	}

	public int remove() throws Exception {

		while (!first.isEmpty()) {
			second.push(first.pop());
		}

		int removed = second.pop();

		while (!second.isEmpty()) {
			first.push(second.pop());
		}
		return removed;
	}

	public int peek() {

		while (!first.isEmpty()) {
			second.push(first.pop());
		}

		int peeked = second.peek();

		while (!second.isEmpty()) {
			first.push(second.pop());
		}
		return peeked;
	}

	public boolean isEmpty() {
		return first.isEmpty();
	}

	public static void main(String[] args) throws Exception {
		ImplementQueueUsingStack stack = new ImplementQueueUsingStack();

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

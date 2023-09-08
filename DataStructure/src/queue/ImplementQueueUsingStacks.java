package queue;

import java.util.Stack;

public class ImplementQueueUsingStacks {
	/*
	 * 232. Implement Queue using Stacks
	 */
	// Approach
	/*
	 * This Question was asked in Google. But this is very easy. You just maintain
	 * two stack one for push and second for pop.
	 * 
	 * Step 1 : We all know that if we push element in stack then last element would
	 * be in top or stack work on LIFO principle whereas queue work on FIFO means
	 * the first element which was added should be remove first.
	 * 
	 * Step 2 : Use first stack to push elements and second for as a helper.
	 * 
	 * Step 3 : Insertion is very easy in stack just push the element. Since stack
	 * is using array internally and you know how array stores elements.
	 * 
	 * Step 4 : The challenge is how to remove? because if you do pop from stack
	 * then it will remove last inserted element not the first one which queue does.
	 * 
	 * Step 5 : Solution is : pop() element from first stack and push in second
	 * stack. Now do the same thing pop() element from second stack and push in
	 * first stack and return popped element. Here we good to go😊.
	 * 
	 * Step 6 : Now for peek element. Do the same this like as step 5 and instead of
	 * returning pop return peek element😊.
	 */
	private Stack<Integer> first;
	private Stack<Integer> second;

	public ImplementQueueUsingStacks() {
		first = new Stack<>();
		second = new Stack<>();
	}

	public void push(int item) {
		first.push(item);
	}

	public int pop() {
		while (!first.empty()) {
			second.push(first.pop());
		}
		int removed = second.pop();
		while (!second.empty()) {
			first.push(second.pop());
		}
		return removed;
	}

	public int peek() {
		while (!first.empty()) {
			second.push(first.pop());
		}
		int peeked = second.peek();
		while (!second.empty()) {
			first.push(second.pop());
		}
		return peeked;
	}

	public boolean empty() {
		return first.isEmpty();
	}

	public static void main(String[] args) {
		ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
		obj.push(2);
		obj.push(3);
		obj.push(4);

		System.out.println(obj.peek());

		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());

		System.out.println(obj.empty());
	}
}

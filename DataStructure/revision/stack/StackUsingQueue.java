package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q = new LinkedList<>();

	void push(int items) {
		q.add(items);

		for (int i = 0; i < q.size() - 1; i++) {
			q.add(q.remove());
		}
	}

	public int pop() {
		return q.remove();
	}

	public int top() {
		return q.peek();
	}

	public int size() {
		return q.size();
	}
}

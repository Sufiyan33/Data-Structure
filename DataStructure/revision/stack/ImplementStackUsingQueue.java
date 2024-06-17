package stack;

public class ImplementStackUsingQueue {

	/*
	 * Here, We are going to implement stack using queue.
	 */
	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();

		stack.push(0);
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(4);

		System.out.println(stack.top());

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}


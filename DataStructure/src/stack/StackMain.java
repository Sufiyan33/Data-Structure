package stack;

public class StackMain {
	public static void main(String[] args) throws StackException {

		CustomStack stack = new CustomStack(5);

		stack.push(3);
		stack.push(9);
		stack.push(12);
		stack.push(15);
		stack.push(18);

		System.out.println("Peek element := " + stack.peek());

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.err.println("Operation with Dynamic stack 👌👌👌");

		DynamicStack dStack = new DynamicStack();

		dStack.push(3);
		dStack.push(9);
		dStack.push(12);
		dStack.push(15);
		dStack.push(18);
		dStack.push(19);
		dStack.push(20);
		dStack.push(12);
		dStack.push(10);
		dStack.push(14);
		dStack.push(21);

		System.err.println("Peek element := " + dStack.peek());

		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());
		System.out.println(dStack.pop());

	}
}

package stack;

public class StackMain {
	public static void main(String[] args) throws StackException {
		CustomStack stack = new CustomStack();

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

	}
}

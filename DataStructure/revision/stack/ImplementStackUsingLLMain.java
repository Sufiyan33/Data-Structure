package stack;

public class ImplementStackUsingLLMain {

	public static void main(String[] args) {
		
		ImplementStackUsingLL stack = new ImplementStackUsingLL();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		stack.display();

		System.out.println(stack.peek());

		System.out.println(stack.pop());

		stack.display();

	}
}

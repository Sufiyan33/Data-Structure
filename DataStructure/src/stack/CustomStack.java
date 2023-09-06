package stack;

public class CustomStack {
	/*
	 * Here, I will create custom stack which will perform push, pop and peek
	 * functionality.
	 * 
	 * Step 1 : Since stack internally using array. Hence I am creating data or
	 * value as array type.
	 * 
	 * Step 2 : Insertion is very easy, We just need a pointer which point the
	 * current value or index.
	 * 
	 * Step 3 : I am taking here default size 10. If size given by user then
	 * constructor will call another constructor having user define size otherwise
	 * default one will called.
	 * 
	 * Step 4 : Push() method take parameter and return true and false but before
	 * adding in stack check if stack is already filled, If yes, then throw
	 * exception. Stack is full if pointer point at last.
	 * 
	 * Step 5 : Pop() method return a value that was removed but before removing
	 * check if stack is not already empty. if yes, throw exception.
	 * 
	 * Step 6 : Peek() method return top element of stack but before returning value
	 * keep in mind that stack should not empty.
	 * 
	 * Tips : We know how to handle custom exception. Hence we can create our own
	 * exception class to handle it.
	 */

	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	int ptr = -1;

	public CustomStack() {
		this(DEFAULT_SIZE);
	}

	public CustomStack(int size) {
		this.data = new int[size];
	}

	public boolean push(int item) {
		if (isFull()) {
			System.out.println("Stack is already filled !!!");
			return false;
		}

		ptr++;
		data[ptr] = item;
		return true;
	}

	public int pop() throws StackException {
		if (isEmpty()) {
			throw new StackException("Can not pop from empty stack 😒 !!!");
		}
		/*
		 * int removed = data[ptr]; ptr--; return removed;
		 */
		// OR you can write below instead of above code;
		return data[ptr--];
	}

	public int peek() throws StackException {
		if (isEmpty()) {
			throw new StackException("Stack is empty hence can't return peek !!!");
		}
		return data[ptr];
	}

	public boolean isEmpty() {
		return ptr == -1;
	}

	public boolean isFull() {
		return ptr == data.length - 1;// pointer is at last
	}

}

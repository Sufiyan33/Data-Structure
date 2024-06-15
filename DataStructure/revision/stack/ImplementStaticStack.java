package stack;

public class ImplementStaticStack {

	/*
	 * Here, I'm going to implement custom stack using size, pointer and array.
	 */

	private int data[];
	private static final int DEFAULT_SIZE = 10;

	int ptr = -1; // Represent as index

	public ImplementStaticStack() {
		this(DEFAULT_SIZE);
	}
	public ImplementStaticStack(int size) {
		this.data = new int[size];
	}

	public boolean push(int items) {
		if (isFull()) {
			System.out.println("Stack is full...");
			return false;
		}
		
		ptr++;
		data[ptr] = items;
		return true;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty...");
			return -1;
		}

		/*
		 * int value = data[ptr]; ptr--; return value;
		 */

		// you can write below.

		return data[ptr--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty...");
			return -1;
		}

		int value = data[ptr];
		ptr--;

		return value;
	}

	private boolean isFull() {

		return ptr == data.length - 1;
	}

	private boolean isEmpty() {
		return ptr == -1;
	}

}

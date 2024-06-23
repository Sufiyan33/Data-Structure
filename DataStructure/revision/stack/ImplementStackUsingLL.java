package stack;

public class ImplementStackUsingLL {

	/*
	 * Here, I'm going to implement stack using Linked List. Here point top to node
	 * & link would be node.next.
	 * 
	 * It should perform all operation of stack.
	 */

	public Node top;
	public int size;

	public ImplementStackUsingLL() {
		this.size = 0;
	}

	public void push(int data) {
		// Create a new node;
		Node temp = new Node(data);

		temp.link = top;
		top = temp;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty...");
			return -1;
		}

		int removed = top.data;
		top = top.link;
		size--;

		return removed;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty...");
			return -1;
		}

		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void display() {
		Node temp = top;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.link;
		}
		System.out.println("END");
	}
}

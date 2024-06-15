package linkedList;

public class DLL {

	/*
	 * Lets create double linkedList from scratch.
	 */

	private Node head;

	public void addFirst(int value) {
		Node node = new Node(value);

		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	public void addLast(int value) {
		Node node = new Node(value);
		Node last = head;

		// If No node is present, in this case head would be last.
		if (head == null) {
			head.prev = null;
			head = node;
		}

		// Run this loop at the end temp will contain temp.next == null.
		while (last.next != null) {
			last = last.next;
		}
		node.prev = last;
		node.next = null;
		last.next = node;
		last = node;
	}

	public void addAtPosition(int value, int index) {
		Node node = new Node(value);
		Node temp = head;

		if (index == 0) {
			addFirst(value);
			return;
		}
		while (temp != null && temp.next == null) {
			temp = temp.next;
		}
		Node findNode = getNode(index - 1);
		findNode.next = node;
		node.next = findNode.next.next;
		node.prev = findNode;

		findNode.next.prev = node;
	}

	// Insert a node after 5. Here index is not given.

	public void addAfter(int after, int value) {
		Node p = findNode(after);

		if (p == null) {
			System.out.println("P does not exist");
			return;
		}
		Node node = new Node(value);
		node.next = p.next;
		p.next = node;
		node.prev = p;

		if (node.next != null) {
			node.next.prev = node;
		}
	}

	public Node findNode(int value) {
		Node node = head;
		while (node != null) {
			if (node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}

	public Node getNode(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	/*
	 * Let's Display doubly LinkedList
	 */
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + " -> ");
			node = node.next;
		}
		System.out.println("END");
	}

	// Print linkedList in reverse order.
	public void displayReversal() {
		Node node = head;
		Node last = null;
		while (node != null) {
			System.out.print(node.value + " -> ");
			last = node;
			node = node.next;
		}
		System.out.println("END");

		// Let's also print in reverse order.
		while (last != null) {
			System.out.print(last.value + " -> ");
			last = last.prev;
		}
		System.out.println("START");
	}

	private class Node {
		int value;
		Node prev;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
}

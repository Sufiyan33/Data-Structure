package linked_List;

public class CustomeDublyLinkList {

	/*
	 * Here we will create custom Doubly Linked List and not using which Java
	 * providing.
	 */
	private Node head;

	// Add element at very first.
	public void addFirst(int val) {
		Node node = new Node(val);

		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	// Add element at last.
	public void addLast(int value) {
		Node node = new Node(value);
		/*
		 * If tail is not given then you can maintain an extra variable as last check
		 * every node. if it reaches at last then last.next keep null.
		 */
		Node last = head;

		node.next = null;

		// If head itself null.
		if (head == null) {
			node.prev = null;
			head = node;
			return;
		}

		// To reach last node.
		while (last.next != null) {
			last = last.next;
		}
		last.next = node;
		node.prev = last;

	}

	// Find an node if value is given.
	public Node find(int value) {
		Node node = head;
		while (node != null) {
			if (node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}

	// Add element after a node.
	public void addAfter(int after, int val) {
		Node p = find(after);
		if (p == null) {
			System.out.println("Does not exist !!!");
			return;
		}

		Node node = new Node(val);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		if (node.next != null) {
			node.next.prev = node;
		}
	}
	// Add code for deletion as well.

	// Display the Doubly linked List.
	public void display() {
		Node node = head;
		Node last = null;
		while (node != null) {
			System.out.print(node.value + " -> ");
			last = node;
			node = node.next;
		}
		System.out.println("END");

		while (last != null) {
			System.out.print(last.value + " -> ");
			last = last.prev;
		}
		System.out.println("START");
	}

	private class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}

		Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}
}

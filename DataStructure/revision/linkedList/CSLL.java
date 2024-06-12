package linkedList;

public class CSLL {
	/*
	 * Here, we are going to create circular Singly linkedList from scratch.
	 */

	private Node head;
	private Node tail;

	public CSLL() {
		this.head = null;
		this.tail = null;
	}

	public void addBegning(int value) {
		Node node = new Node(value);

		/*
		 * If head == null means list is empty and add one node.Now head and tail are
		 * pointing to the same node.
		 */
		if (head == null) {
			head = node;
			tail = node;
			return;
		}

		tail.next = node;
		node.next = head;
		tail = node;
	}

	public void display() {
		Node node = head;

		/*
		 * If there are only one Node then node.next will be null & it will throw NPE
		 * then how to display.
		 */

		if (head.next == null) {
			System.out.print(node.value + " -> ");
			System.out.println("HEAD");
			return;
		}

		if (head != null) {
			do {
				System.out.print(node.value + " -> ");
				node = node.next;
			} while (node != head);
		}
		System.out.println("HEAD");
	}

	public void delete(int value) {
		Node node = head;

		if (node == null) {
			return;
		}

		// If head node contain that value which want to delete.
		if (node.value == value) {
			head = head.next;
			tail.next = head;
			return;
		}

		// Otherwise keep traversing until you found the value.

		do {
			Node n = node.next;
			if (n.value == value) {
				node.next = n.next;
				break;
			}
			// if not then move next.
			node = node.next;
		} while (node != head);
	}

	private class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}
}

package linked_List;

public class CircularLinkedList {

	/*
	 * Here, we will create and work on circular linked list and this is very
	 * similar to Singly LL.
	 * 
	 * In this no node will point to null until and unless list is empty.
	 * 
	 * So, Lets add, delete element or node.
	 */

	private Node head;
	private Node tail;

	public void insertNode(int value) {
		Node node = new Node(value);

		// Check if list is empty.
		if (head == null) {
			head = node;
			tail = node;
			return;
		}

		node.next = head;
		tail.next = node;
		tail = node;
	}

	// Delete element.
	public void delete(int value) {
		Node node = head;

		// If node itself null then simply return.
		if (node == null) {
			return;
		}

		// If element present at head then head will point to next node.
		if (node.value == value) {
			head = head.next;
			tail.next = head;
			return;
		}

		do {
			Node n = node.next;
			if (n.value == value) {
				node.next = n.next;
				break;
			}
			node = node.next;
		} while (node != head);
	}

	// Add more insertion and deletion method.

	// Display the element.
	public void display() {
		Node node = head;
		if (head != null) {
			do {
				System.out.print(node.value + " -> ");
				node = node.next;
			} while (node != head);
			System.out.println("HEAD");
		}
	}

	public class Node {
		int value;
		Node next;

		public Node(int value) {
			super();
			this.value = value;
		}
	}
}

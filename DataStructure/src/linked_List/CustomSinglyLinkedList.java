package linked_List;

public class CustomSinglyLinkedList {
	/*
	 * Here we will create Singly linked list from scratch means we are not going to
	 * use that java provided.
	 * 
	 * Every linked list have Node (value and next), head and tail.
	 * 
	 * 1- How to add node at beginning.
	 * 
	 * 2- How to add node at last.
	 * 
	 * 3- How to add in given index.
	 * 
	 * 4- How to delete from starting.
	 * 
	 * 5- How to delete from last.
	 * 
	 * 6- How to delete from a given index.
	 * 
	 * 7- How to find a node.
	 */

	private Node head;
	private Node tail;
	private int size;

	public CustomSinglyLinkedList() {
		this.size = 0;
	}

	// Adding first node or value in node.
	public void addFirstNode(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size += 1;
	}

	// Adding element in the last.
	public void addElementInLast(int value) {
		Node node = new Node(value);
		if (tail == null) {
			addFirstNode(value);
			return;
		}
		tail.next = node;
		tail = node;
		size += 1;
	}

	// Add element at nth positions.
	public void addElementAtIndex(int value, int index) {

		if (index == 0) {
			addFirstNode(value);
			return;
		}

		if (index == size) {
			addElementInLast(value);
			return;
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
	}

	// Delete first node or element.
	public int deleteFirst() {
		int val = head.value;
		head = head.next;

		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}

	// Delete element at last;
	public int deleteLast() {
		if (size <= 1) {
			deleteFirst();
		}

		Node secondLast = getNode(size - 2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;
		return val;
	}

	// Delete element from a particular index.
	public int deleteFromIndex(int index) {
		if (index == 0) {
			return deleteFirst();
		}

		if (index == size - 1) {
			return deleteLast();
		}

		Node prev = getNode(index - 1);
		int val = prev.next.value;

		prev.next = prev.next.next;

		return val;
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

	// Get node of a given index;
	public Node getNode(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	// 83. Remove Duplicates from Sorted List(LeetCode)

	public void removeDuplicates() {
		Node node = head;
		while (node.next != null) {
			if (node.value == node.next.value) {
				node.next = node.next.next;
				size--;
			} else {
				node = node.next;
			}
		}
		tail = node;
		tail.next = null;
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}

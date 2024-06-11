package linkedList;

public class SLL {

	/*
	 * Here, we are going to create singly linked List from scratch.
	 * 
	 * Every list have two things :
	 * 
	 * Head := pointing to the first element in list.
	 * 
	 * Tail := pointing to the last element in the list.
	 */

	private Node head;
	private Node tail;
	private int size;

	public SLL() {
		this.size = 0;
	}

	// Insert data at firstPosition.Since we are inserting at first position then
	// create node.
	public void insertAtFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

		/*
		 * check if tail == null if yes, it means this is the first node in list. So
		 * here head == tail means head and tail will point at same node.
		 */
		if (tail == null) {
			tail = head;
		}
		// after adding node increase list size.
		size += 1;
	}

	// At node at last.
	public void insertLast(int data) {
		Node node = new Node(data);

		// If tail is null it means you need to insert at the first place.
		if (tail == null) {
			insertAtFirst(data);
		}

		tail.next = node;
		tail = node;
		tail.next = null;

		size++;
	}
	/*
	 * Now insert at particular given index. Here first you need to find index where
	 * you need to insert and index-1 node from which you will connect. And also
	 * store next node in temp because newly created tail.next need to point next
	 * node.
	 */

	public void insertAtIndex(int data, int index) {
		if (index == 0) {
			insertAtFirst(data);
			return;
		}

		// if index is equal to given size then add in the last.
		if (index == size) {
			insertLast(data);
			return;
		}

		/*
		 * Here, you need to reach till index-1, once reach then add new node & its
		 * value.
		 */
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(data, temp.next);
		temp.next = node; // current node pointing to next.
		size++;
	}

	/*
	 * Now let's display list. At the time of displaying do not change head
	 * locations. Head always point to the first node. THen how to do?
	 * 
	 * Take a new variable call temp and assign head to temp.
	 */

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	/*
	 * Create private (inner class) for node & value
	 */
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}

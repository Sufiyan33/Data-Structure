package linked_List;

public class LeetCodeProblem {
	/*
	 * In this class we will solve leetCode problems
	 */

	private Node head;
	private Node tail;
	private int size;

	public LeetCodeProblem() {
		this.size = 0;
	}

	// Question 1 : Find the length of cycle in linked list.
	/*
	 * Approach :
	 * 
	 * Again this is the same question like as previous just run two pointer when
	 * fast pointer then count length;
	 */

	public int countLength(Node node) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			// Calculate length
			if (slow == fast) {
				Node temp = slow;
				int length = 0;
				do {
					temp = temp.next;
					length++;
				} while (slow != fast);
				return length;
			}
		}
		return 0;
	}

	// Question 2 : 142. Linked List Cycle II (Return node from where cycle begins.

	/*
	 * Approach :
	 * 
	 * 1- Find the length of cycle.
	 * 
	 * 2- move slow ahead by length of cycle times.
	 * 
	 * 3- move slow and fast one by one and it will meet at cycle start.
	 */

	public Node detectCycle(Node node) {
		int length = 0;
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (slow == fast) {
				length = countLength(slow);
				break;
			}
		}

		if (length == 0) {
			return null;
		}
		// Find start node.
		Node s = head;
		Node f = head;
		if (length > 0) {
			s = s.next;
			length--;
		}
		// Keep moving f and s and they will meet at cycle start.
		while (f != s) {
			f = f.next;
			s = s.next;
		}
		return s;
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

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
}

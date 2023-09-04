package linked_List;

public class LinkedListCycle {
	/*
	 * 141. Linked List Cycle
	 * 
	 * Here, we need to find out cycle means cycle detection. Let's say Two people
	 * are running on a circle then definitely they meet at any point. If they meet
	 * means cycle present
	 */
	// Approach
	/*
	 * So, Here I will use Fast and Slow pointer (Two pointer approach).
	 * 
	 * 1- Initialize two pointer slow and fast.
	 * 
	 * 2- Initially both are pointing to head.
	 * 
	 * 
	 * 3- When loop run slow pointer move step ahead while fast pointer move it's
	 * double.
	 * 
	 * 4- If both pointer meet at a particular point it means cycle present other
	 * no.
	 */
	private Node head;
	private Node tail;
	private int size;

	public LinkedListCycle() {
		this.size = 0;
	}

	public boolean hasCycle(Node node) {
		Node fast = head;
		Node slow = head;

		while (fast != null && slow != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
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

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public static void main(String[] args) {
		LinkedListCycle list = new LinkedListCycle();
		list.addFirstNode(3);
		list.addFirstNode(3);
		list.addFirstNode(7);
		list.addFirstNode(9);
		list.addFirstNode(10);
		System.out.println("Size of list := " + list.size);
		list.display();
	}
}

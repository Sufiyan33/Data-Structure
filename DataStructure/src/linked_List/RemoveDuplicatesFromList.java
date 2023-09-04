package linked_List;

public class RemoveDuplicatesFromList {
	/*
	 * 83. Remove Duplicates from Sorted List(LeetCode)
	 */
	private Node head;
	private Node tail;
	private int size;

	public RemoveDuplicatesFromList() {
		this.size = 0;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromList list = new RemoveDuplicatesFromList();
		list.addFirstNode(3);
		list.addFirstNode(3);
		list.addFirstNode(7);
		list.addFirstNode(9);
		list.addFirstNode(10);
		System.out.println("Size of list := " + list.size);
		list.display();

		list.removeDuplicates();
		System.out.println("Size of list := " + list.size);
		list.display();
	}

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
}

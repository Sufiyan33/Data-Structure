package linkedList;

public class LeetCodeProblems {

	private Node head;
	private int size;
	private Node tail;

	public LeetCodeProblems() {
		this.size = 0;
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

	public void display() {
		Node node = head;

		while (node != null) {
			System.out.print(node.value + " -> ");
			node = node.next;
		}
		System.out.println("END");
	}

	public void insertAtFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size += 1;
	}

	public static void main(String[] args) {
		LeetCodeProblems list = new LeetCodeProblems();
		list.insertAtFirst(1);
		list.insertAtFirst(2);
		list.insertAtFirst(4);
		list.insertAtFirst(4);

		list.display();

		list.removeDuplicates();
		list.display();
	}
}

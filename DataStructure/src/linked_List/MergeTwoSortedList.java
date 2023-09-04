package linked_List;

public class MergeTwoSortedList {
	private Node head;
	private Node tail;
	private int size;

	public MergeTwoSortedList() {
		this.size = 0;
	}

	public static void main(String[] args) {
		MergeTwoSortedList list1 = new MergeTwoSortedList();
		MergeTwoSortedList list2 = new MergeTwoSortedList();

		list1.addElementInLast(1);
		list1.addElementInLast(1);
		list1.addElementInLast(2);
		list1.display();

		list2.addElementInLast(4);
		list2.addElementInLast(3);
		list2.addElementInLast(5);
		list2.display();

		MergeTwoSortedList ans = MergeTwoSortedList.mergeTwoList(list1, list2);
		ans.display();
		System.out.println("size =: " + ans.size);
	}

	public static MergeTwoSortedList mergeTwoList(MergeTwoSortedList first, MergeTwoSortedList second) {
		Node f = first.head;
		Node s = second.head;

		MergeTwoSortedList ans = new MergeTwoSortedList();

		while (f != null && s != null) {
			if (f.value < s.value) {
				ans.addElementInLast(f.value);
				f = f.next;
			} else {
				ans.addElementInLast(s.value);
				s = s.next;
			}
		}

		while (f != null) {
			ans.addElementInLast(f.value);
			f = f.next;
		}
		while (s != null) {
			ans.addElementInLast(s.value);
			s = s.next;
		}
		return ans;
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

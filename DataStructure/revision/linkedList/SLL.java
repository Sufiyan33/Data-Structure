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

		// What if index in not found then throw Exception.
		if (index > size) {
			throw new IndexOutOfBoundsException();
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
	 * Let's delete node from all positions. If you want to return then add return
	 * type other wise take void.
	 */

	public int deleteFromBegning() throws Exception {
		if (head == null) {
			throw new Exception("You can't delet because List is empty");
		}

		int value = head.data;
		head = head.next;

		if (head == null) {
			tail = null;
		}
		return value;
	}

	/*
	 * Delete a node from last.
	 */

	/*
	 * public void deleteFromLast() { Node temp = head; for (int i = 1; i < size -
	 * 1; i++) { temp = temp.next; } temp.next = null; tail = temp; }
	 */
	/*
	 * Above method will also delete from last but lets make some more organized.
	 * First find index of each particular node then make 2nd last node as tail.
	 */

	public Node getNode(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public int deleteFromLast() throws Exception {
		if (size <= 1) {
			return deleteFromBegning();
		}

		Node secondLast = getNode(size - 2);
		tail = secondLast;
		int value = tail.data;
		tail.next = null;

		return value;
	}

	public int deleteFromAtPosition(int index) throws Exception {
		if (index == 0) {
			return deleteFromBegning();
		}

		if (index == size) {
			return deleteFromLast();
		}

		Node findNode = getNode(index - 1);
		int value = findNode.next.data;
		findNode.next = findNode.next.next;

		return value;
	}

	/*
	 * Question : for value = 4 find node.
	 */
	public Node find(int value) {
		Node node = head;
		while (node != null) {
			if (node.data == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}

	/*
	 * merge two sorted list.
	 */
	public static SLL merge(SLL first, SLL second) {
		Node f = first.head;
		Node s = second.head;

		SLL ans = new SLL();

		while (f != null && s != null) {
			if (f.data < s.data) {
				ans.insertLast(f.data);
				f = f.next;
			} else {
				ans.insertLast(s.data);
				s = s.next;
			}
		}

		// If some items remain in list first then add.
		while (f != null) {
			ans.insertLast(f.data);
			f = f.next;
		}

		// If some items remain in second list then add.
		while (s != null) {
			ans.insertLast(s.data);
		}

		return ans;
	}

	/*
	 * Linked List cycle. use slow and fast pointer.
	 * 
	 * If slow == fast pointer it means cycle present. If any of them point to null.
	 * it means cycle is not present.
	 */

	public boolean cycle() {
		Node fast = head;
		Node slow = head;

		while (head != null) {
			if (slow == fast) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}

	/*
	 * Find length of cycle. If cycle exist then find length.
	 * 
	 * Use above detectCylce code and make some changes.
	 */
	public int cycLength(Node node) {
		Node fast = head;
		Node slow = head;

		while (head != null) {
			if (slow == fast) {
				// Calculate length.
				Node temp = slow;
				int length = 0;
				do {
					temp = temp.next;
					length++;
				} while (temp != slow);
				return length;
			}
		}
		return 0;
	}

	/*
	 * Return cycle begin node, if cycle not present then return null.
	 * 
	 * 1 : First find length of cycle.
	 * 
	 * 2 : Move s pointer ahead by length of cycle times.
	 * 
	 * 3 : Move both s & f pointer one by one, it will meet at start.
	 */

	public Node findCycleStart(Node head) {
		int length = 0;

		Node fast = head;
		Node slow = head;

		while (fast != null & fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				length = cycLength(slow);
				break;
			}
		}

		// if no cycle present return null
		if (length == 0) {
			return null;
		}
		// find start node.
		Node f = head;
		Node s = head;

		// move s ahead of length time.
		while (length > 0) {
			s = s.next;
			length--;
		}

		// move both s & slow pointer one by one.
		while (f != s) {
			f = f.next;
			s = s.next;
		}

		return s;
	}

	/*
	 * Reverse LinkedList, we can do this in two ways :
	 * 
	 * 1 : By using recursion.
	 * 
	 * 2 : By using in-place reversal (Don't take extra space).
	 */
	// 1 : If head & tail is given in question.
	public void reverseList(Node node) {

		// Base conditions
		if (node == tail) {
			head = tail;
			return;
		}

		reverseList(node.next);

		tail.next = node;
		tail = node;
		tail.next = null;
	}

	// 2 : Reverse LinkedList in-place means don't take extra space.
	public void reverse(Node node) {

		// If method return then add below code.
		/*
		 * if (head == null) return head;
		 */

		if (size < 2)
			return;

		Node prev = null;
		Node present = head;
		Node next = present.next;

		while (present != null) {
			present.next = prev;
			prev = present;
			present = next;

			if (next != null) {
				next = next.next;
			}
		}

		head = prev;
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

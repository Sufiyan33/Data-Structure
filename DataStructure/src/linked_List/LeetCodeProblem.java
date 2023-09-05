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

	// Question 3 : 202. Happy Number (If a number digits square sum equal to 1)
	/*
	 * Approach :
	 * 
	 * 1- initialize two pointer slow and fast.
	 * 
	 * 2- Find square of digits
	 * 
	 * 3- if cycle present means not a happy number.
	 */

	public boolean isHappy(int n) {
		int slow = n;
		int fast = n;

		do {
			slow = findSquare(slow);
			fast = findSquare(findSquare(fast));
		} while (slow != fast);

		if (slow == 1) {
			return true;
		}
		return false;
	}

	// Find Square of a number;
	private int findSquare(int number) {
		int ans = 0;
		while (number > 0) {
			int reminder = number % 10;
			ans += reminder * reminder;
			number /= 10;
		}
		return ans;
	}

	// Question 4 : 206. Reverse Linked List
	/*
	 * Approach :
	 * 
	 * 1- Initialize 3 pointers : previous, present and next.
	 * 
	 * 2- At initial stage previous will point to null, Present point to head and
	 * Next will point to present.next;
	 * 
	 * 3- At each move they will swap their value.
	 * 
	 * 4- But keep in mind that when next move ahead then need to check NPE.
	 * 
	 * 5- If present pointer will reach to end means point to null then previous
	 * pointer will point to last node (tail).
	 * 
	 * 6- Then simply return previous node.
	 */

	public Node reverseList(Node head) {
		if (head == null) {
			return head;
		}

		Node prev = null;
		Node pres = head;
		Node next = pres.next;

		while (pres != null) {
			pres.next = prev;
			prev = pres;
			pres = next;
			if (next != null) {
				next = next.next;
			}
		}
		head = prev;
		return head;
	}

	// Question 5 : 92. Reverse Linked List II
	/*
	 * When given in a range or reverse sublist of Linked List.
	 */
	public Node reverseBetween(Node head, int left, int right) {
		if (left == right) {
			return head;
		}

		// skip the first left-1 nodes
		Node current = head;
		Node prev = null;
		for (int i = 0; current != null && i < left - 1; i++) {
			prev = current;
			current = current.next;
		}

		Node last = prev;
		Node newEnd = current;

		// reverse between left and right
		Node next = current.next;
		for (int i = 0; current != null && i < right - left + 1; i++) {
			current.next = prev;
			prev = current;
			current = next;
			if (next != null) {
				next = next.next;
			}
		}

		if (last != null) {
			last.next = prev;
		} else {
			head = prev;
		}

		newEnd.next = current;
		return head;
	}

	// Question 6 : 234. Palindrome Linked List
	/*
	 * You need to check if given list is Palindrome or not.
	 * 
	 * Step 1 : Find middle of list.
	 * 
	 * 2 : Reverse the 2nd half of list.
	 * 
	 * 3 : Compare the first half and second half.
	 * 
	 * 4: Re-reverse the second part.
	 */

	public boolean isPalindrome(Node head) {
		Node mid = middleNode(head);
		Node headSecond = reverseList(mid);
		Node reverseHead = headSecond;

		// Now compare 1st half and second half.
		while (head != null && headSecond != null) {
			if (head.value != headSecond.value) {
				break;
			}
			head = head.next;
			headSecond = headSecond.next;
		}
		// Now re-reverse List
		reverseList(reverseHead);
		return head == null || headSecond == null;
	}

	private Node middleNode(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
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

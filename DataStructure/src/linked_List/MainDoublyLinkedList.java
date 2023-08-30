package linked_List;

public class MainDoublyLinkedList {

	public static void main(String[] args) {
		CustomeDublyLinkList list = new CustomeDublyLinkList();

		list.addFirst(3);
		list.addFirst(6);
		list.addFirst(9);
		list.addFirst(12);
		list.display();

		System.out.println("--- Add at last ---");
		list.addLast(23);
		list.display();

		System.out.println("--- Add element after a node ---");
		list.addAfter(6, 13);
		list.addAfter(23, 13);
		list.display();

	}
}

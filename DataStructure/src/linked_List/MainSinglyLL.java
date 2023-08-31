package linked_List;

public class MainSinglyLL {

	public static void main(String[] args) {
		CustomSinglyLinkedList list = new CustomSinglyLinkedList();

		System.out.println("--- Add element at first ---");
		list.addFirstNode(2);
		list.addFirstNode(4);
		list.addFirstNode(9);
		list.addFirstNode(17);

		list.display();

		System.out.println("--- Add element at last ---");
		list.addElementInLast(20);
		list.display();

		System.out.println("--- Add Element at nth position ---");
		list.addElementAtIndex(25, 3);
		list.display();

		System.out.println("--- Delete first Node or element ---");
		int del = list.deleteFirst();
		System.out.println("Deleted element is := " + del);
		list.display();

		System.out.println("--- Delete element from last ---");
		list.deleteLast();
		list.display();

		System.out.println("--- Delete element from at given index ---");
		int d = list.deleteFromIndex(2);
		System.out.println("Deleted value is := " + d);
		list.display();

		System.out.println("--- Find a Node if element is given ---");
		System.out.println(list.find(2));
		list.display();

		// Merge two list;
		System.out.println("--- Merge two sorted list ---");
		CustomSinglyLinkedList list1 = new CustomSinglyLinkedList();
		CustomSinglyLinkedList list2 = new CustomSinglyLinkedList();

		list1.addElementInLast(1);
		list1.addElementInLast(1);
		list1.addElementInLast(2);
		list1.display();

		list2.addElementInLast(4);
		list2.addElementInLast(3);
		list2.addElementInLast(5);
		list2.display();

		CustomSinglyLinkedList ans = CustomSinglyLinkedList.mergeTwoList(list1, list2);
		ans.display();

	}
}

package linked_List;

public class Main {

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

	}
}

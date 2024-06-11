package linkedList;

public class Main {

	public static void main(String[] args) {
		SLL list = new SLL();
		list.insertAtFirst(3);
		list.display();

		list.insertLast(6);
		list.insertLast(8);
		list.display();

		list.insertAtIndex(4, 2);
		list.display();
	}
}

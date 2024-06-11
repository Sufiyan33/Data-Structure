package linkedList;

public class Main {

	public static void main(String[] args) throws Exception {
		SLL list = new SLL();
		list.insertAtFirst(3);
		list.display();

		list.insertLast(6);
		list.insertLast(8);
		list.insertLast(9);
		list.display();

		list.insertAtIndex(4, 2);
		list.display();

		// list.deleteFromBegning();
		// list.display();

		// list.deleteFromLast();
		System.out.println(list.deleteFromAtPosition(0));
		list.display();

		list.find(8);

	}
}

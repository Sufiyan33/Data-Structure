package linkedList;

public class DLLMain {

	public static void main(String[] args) {
		DLL list = new DLL();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);

		list.display();
		// list.displayReversal();

		list.addLast(5);
		list.addLast(6);
		list.display();

		// list.addAtPosition(6, 2);
		list.addAfter(3, 65);
		list.display();
	}

}

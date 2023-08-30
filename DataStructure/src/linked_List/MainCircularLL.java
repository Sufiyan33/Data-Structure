package linked_List;

public class MainCircularLL {

	public static void main(String[] args) {
		CircularLinkedList clist = new CircularLinkedList();
		clist.insertNode(2);
		clist.insertNode(13);
		clist.insertNode(4);
		clist.insertNode(3);
		clist.insertNode(12);
		clist.display();

		System.out.println("--- Delete element ---");
		clist.delete(1);
		clist.display();
	}

}

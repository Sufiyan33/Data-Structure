package linkedList;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * SLL list = new SLL(); list.insertAtFirst(3); list.display();
		 * 
		 * list.insertLast(6); list.insertLast(8); list.insertLast(9); list.display();
		 * 
		 * list.insertAtIndex(4, 2); list.display();
		 * 
		 * // list.deleteFromBegning(); // list.display();
		 * 
		 * // list.deleteFromLast(); System.out.println(list.deleteFromAtPosition(0));
		 * list.display();
		 * 
		 * list.find(8);
		 */

		SLL first = new SLL();
		SLL second = new SLL();

		first.insertLast(1);
		first.insertLast(2);
		first.insertLast(3);

		second.insertLast(4);
		second.insertLast(5);
		second.insertLast(9);
		second.insertLast(14);

		// that's why merge method made static.
		SLL ans = SLL.merge(first, second);
		ans.display();

	}
}

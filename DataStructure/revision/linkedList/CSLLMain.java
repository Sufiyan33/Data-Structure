package linkedList;

public class CSLLMain {

	public static void main(String[] args) {
		CSLL list = new CSLL();
		list.addBegning(3);
		list.addBegning(4);
		list.addBegning(5);
		list.addBegning(6);
		list.display();

		list.delete(6);
		list.display();
	}
}

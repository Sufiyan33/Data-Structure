package arrayList;

public class Main {
	public static void main(String[] args) {
		CustomeArrayList list = new CustomeArrayList();
		/*
		 * list.add(2); list.add(5); list.add(10);
		 */

		for (int i = 0; i < 15; i++) {
			list.add(2 * i);
		}

		System.out.println(list);
	}
}

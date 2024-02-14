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

		System.out.println("----------For generics list-------------------------");

		CustomeArrayListWithGenerics<Integer> ll = new CustomeArrayListWithGenerics<>();
		ll.add(23);

		for (int i = 0; i < 14; i++) {
			ll.add(2 * i);
		}
		System.out.println(ll);
	}
}

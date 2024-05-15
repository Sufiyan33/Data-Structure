package test_knowledge;

import java.util.ArrayList;
import java.util.Vector;

public class AddCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(15);
		al.add(13);
		al.add(14);

		System.out.println(al);

		Vector<Integer> v = new Vector<>(al);
		v.add(20);
		v.add(21);
		v.add(22);

		System.out.println(v);

		for (Integer vv : v) {
			System.out.println(vv);
		}
	}
}

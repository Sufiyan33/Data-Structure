package test_knowledge;

import java.util.HashMap;
import java.util.Map;

public class Sabir {

	/*
	 * Map misclleanious case.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e1 = new Emp();
		e1.setId(1);
		e1.setName("Alfaz");

		Emp e2 = new Emp();
		e2.setId(2);
		e2.setName("Sufiyan");

		HashMap<Emp, Integer> hm = new HashMap<>();
		hm.put(e1, 1);
		hm.put(e2, 2);

		System.out.println(hm.size());
		for (Map.Entry<Emp, Integer> map : hm.entrySet()) {
			System.out.println(map.getKey() + " & " + map.getValue());
		}

		e2.setId(1);
		e2.setName("Alfaz");

		System.out.println(hm.size());
		for (Map.Entry<Emp, Integer> map : hm.entrySet()) {
			System.out.println(map.getKey() + " & " + map.getValue());
		}

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}

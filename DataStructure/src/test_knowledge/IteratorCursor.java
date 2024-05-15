package test_knowledge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5, 5, 6, 7, 7, 89, 12 };
		List<Integer> list = new ArrayList<>(Arrays.asList(a));

		// System.out.println(list);

		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			Integer value = i.next();
			System.out.println(value);

			if (value.equals(89)) {
				i.remove();
			}
		}

	}
}

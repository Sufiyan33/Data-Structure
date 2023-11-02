package test_knowledge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test15 {

	public static void main(String[] args) {
		// Scenario 1 :
		final List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		System.out.println(list);

		// Scenario 2 :
		final List<Integer> list1 = Arrays.asList(10, 20);
		list1.add(20);
		System.out.println(list1);
	}
}

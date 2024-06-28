package test_knowledge;

import java.util.ArrayList;
import java.util.List;

public class Test27 {

	/*
	 * Find the size of list
	 */
	public static void main(String[] args) {
		List<Integer> list2 = processList(new ArrayList<Integer>());
		System.out.println("List2 size :: " + list2.size());
	}
	
	public static List<Integer> processList(List<Integer> list) {
		List<Integer> list1 = list;

		for (int i = 0; i < 10; i++) {
			list1.add(i);
		}
		
		System.out.println("list size :: " + list.size());
		return list;
	}
}

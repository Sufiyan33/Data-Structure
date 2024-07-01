package test_knowledge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test29 {

	/*
	 * Combine multiple list by using various ways...
	 */

	public static void main(String[] args) {
		List<String> listA = Arrays.asList("A", "B", "C");
		List<String> listB = Arrays.asList("C", "D", "E", "F");
		List<String> listC = Arrays.asList("G", "H", "I", "J");
		List<String> listD = Arrays.asList("K", "L", "M", "N");

		/*
		 * it will throw you UnsupportedOperationException. // listA.addAll(listB); //
		 * listA.addAll(listC); // listA.addAll(listD);
		 */

		/*
		 * Hence create a new list and then combine list.
		 */
		List<String> list = new ArrayList<>();
		list.addAll(listA);
		list.addAll(listB);
		list.addAll(listC);
		list.addAll(listD);

		System.out.println(list);

		System.out.println("<-------------------------------->");
		List<String> list1 = Stream.concat(listA.stream(), listB.stream()).collect(Collectors.toList());
		List<String> list2 = Stream.concat(list1.stream(), listC.stream()).collect(Collectors.toList());
		List<String> list3 = Stream.concat(list2.stream(), listD.stream()).collect(Collectors.toList());
		System.out.println(list3);
	}
}

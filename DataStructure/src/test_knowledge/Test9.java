package test_knowledge;

import java.util.Arrays;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {

		String s = "1";
		s.concat("1");
		s += "1";
		System.out.println(s);

		String s1 = new String("xyz");
		String s2 = new String("xyz");
		System.out.println(s1 == s2);

		final List<Integer> list = Arrays.asList(1, 2, 3);
		list.add(7);
		System.out.println(list);
	}
}

package test_knowledge;

import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		Set<Test2> s = new TreeSet<>();
		s.add(new Test2());
		s.add(new Test2());
		s.add(new Test2());
		System.out.println(s);

	}
}

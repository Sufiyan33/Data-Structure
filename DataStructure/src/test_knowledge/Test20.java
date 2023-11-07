package test_knowledge;

import java.util.TreeSet;

public class Test20 {

	public static void main(String[] args) {

		Emp e1 = new Emp(1, "John");
		Emp e2 = new Emp(1, "John");

		TreeSet t = new TreeSet<>();
		t.add(e1);
		t.add(e2);

		System.out.println(t);
	}
}

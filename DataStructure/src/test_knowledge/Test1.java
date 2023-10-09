package test_knowledge;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println(args.length);
		}

		char chars[] = { 'a', 'b', 'c' };
		String s = new String(chars);
		System.out.println(s);

		Recursion r = new Recursion();
		System.out.println(r.fun(5));

		double x = 3.14;
		int y = (int) Math.ceil(x);
		System.out.println(y);

		System.out.println("----------------------");

		LinkedList list = new LinkedList();
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));

		Iterator i = list.iterator();
		Collections.reverse(list);
		Collections.sort(list);
		while (i.hasNext()) {
			System.out.println(i.next() + " ");
		}
		System.out.println("-----Thread---------");

		new MyThread();

		System.out.println("------Overload-----------");

		Overload o = new Overload();
		int a = 2;
		double b = 3.2;
		o.add(a, a);
		o.add(b, b);
		System.out.println(o.x + " " + o.y);

		System.out.println("-----Next----------");

		try {
			int[] aa = new int[5];
			String ss = "1.0";
			int xx = 2;
			int yy = 3;
			System.out.println(ss + "" + xx + yy);
			System.out.println(ss + "" + (xx + yy));
			try {
				System.out.println(Integer.parseInt(ss + aa[4]));

			} catch (Exception e) {
				System.out.println("exception 1 occures : " + e.getCause());
			}
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception 2 occurs");
		}

		System.out.println("------===========-------");
		String str = "Hello There!";
		String mtr = "Hello" + "" + "There" + "!";
		String ntr = "Hello" + "There" + "!";
		String gtr = "Hello There" + "!";
		System.out.println(str == mtr);
		System.out.println(str == ntr);
		System.out.println(str == gtr);

	}
}

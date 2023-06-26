package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWithWildCard {
	/*
	 * here we are using ? as wild cart character and bounded with Number. Now we
	 * can pass any types of data which hold Number class.
	 */
	public static void main(String[] args) {

		List<Double> intList = new ArrayList<>();
		intList.add(12.3);
		intList.add(23.43);

		print(intList);
	}

	public static void print(List<? extends Number> list) {
		System.out.println(list);
	}
}

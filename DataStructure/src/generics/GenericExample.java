package generics;

public class GenericExample {

	public static void main(String[] args) {
		IntegerCount iCount = new IntegerCount(1);
		iCount.print();

		DoubleCount dCount = new DoubleCount(12.3);
		dCount.print();

		Count<String> count = new Count<String>("Sufiyan");
		count.print();

		BoundWithGenerics<Number> bound = new BoundWithGenerics<Number>(123f);
		// you can pass here any number like : int, float, double, long
		bound.print();

		MultipleBounds<Number, Number> mb = new MultipleBounds<Number, Number>(23, 23);
		mb.print(23, 25);
	}
}

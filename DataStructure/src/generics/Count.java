package generics;

public class Count<T> {

	T t;

	public Count(T t) {
		this.t = t;
	}

	public void print() {
		System.out.println("Number with Generics are :: " + t);
	}
}

package generics;

import java.io.Serializable;

public class BoundWithGenerics<T extends Serializable> {

	T num;

	public BoundWithGenerics(T num) {
		this.num = num;
	}

	public void print() {
		System.out.println("Generics with Bound :: " + num);
	}
}

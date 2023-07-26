package generics;

import java.io.Serializable;

public class MultipleBounds<T, U extends Number & Serializable> {

	public T t;
	public U u;

	public MultipleBounds(T t, U u) {
		this.t = t;
		this.u = u;
	}

	@SuppressWarnings("hiding")
	public <T, U> T print(T t, U u) {
		System.out.println(t);
		System.out.println(u);
		return t;
	}
}

package arrayList;

import java.util.Arrays;

public class CustomeArrayListWithGenerics<T> {

	private Object[] data;
	private static int DEFAULT_CAPACITY = 10;
	private int size = 0; // it will also works as index

	public CustomeArrayListWithGenerics() {
		this.data = new Object[DEFAULT_CAPACITY];
	}

	public void add(T num) {
		if (isFull()) {
			resize();
		}
		data[size++] = num;
	}

	public T remove() {
		@SuppressWarnings("unchecked")
		T removed = (T) (data[--size]);
		return removed;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) data[index];
	}

	public int size() {
		return size;
	}

	public void set(int index, int value) {
		data[index] = value;
	}

	private boolean isFull() {
		return data.length == size;
	}

	private void resize() {
		Object temp[] = new Object[data.length * 2];
		// now copy the current array data into new array
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	// to print list we need to override toString method of object class

	@Override
	public String toString() {
		return "CustomeArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}
}

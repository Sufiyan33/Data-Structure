package arrayList;

import java.util.Arrays;

public class CustomeArrayList {

	private int[] data;
	private static int DEFAULT_CAPACITY = 10;
	private int size = 0; // it will also works as index

	public CustomeArrayList() {
		this.data = new int[DEFAULT_CAPACITY];
	}

	public void add(int num) {
		if (isFull()) {
			resize();
		}
		data[size++] = num;
	}

	public int remove() {
		int removed = data[--size];
		return removed;
	}

	public int get(int index) {
		return data[index];
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
		int temp[] = new int[data.length * 2];
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

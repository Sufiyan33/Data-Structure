package queue;

public class StaticQueueImpl {

	/*
	 * Here, we are going to implement custom queue.
	 * 
	 * You can also implement by taking two pointer
	 * 
	 * p1 - for front/Head &
	 * 
	 * p2 - for end/rear/trail.
	 * 
	 * But I am taking only one pointer i.e end.
	 */

	public int[] data;
	public static final int DEFUALT_CAPACITY = 10;
	int end = 0;

	public StaticQueueImpl() {
		this(DEFUALT_CAPACITY);
	}

	public StaticQueueImpl(int size) {
		this.data = new int[size];
	}

	// Insertion takes o(1)
	public boolean push(int items) {
		if (isFull()) {
			return false;
		}

		data[end++] = items;

		return true;
	}

	// Removal takes o(n) times
	public int removeData() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty... ");
		}

		int removed = data[0];

		// Now shift all elements left by one.
		for (int i = 1; i < end; i++) {
			data[i - 1] = data[i];
		}
		end--;

		return removed;
	}

	public int front() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty...");
		}

		return data[0];
	}

	public void display() {
		for (int index = 0; index < end; index++) {
			System.out.print(data[index] + " ");
		}
		System.out.println("END");
	}

	public boolean isFull() {
		return end == data.length;
	}

	public boolean isEmpty() {
		return end == 0;
	}
}

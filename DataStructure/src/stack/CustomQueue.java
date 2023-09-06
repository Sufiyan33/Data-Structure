package stack;

public class CustomQueue {
	/*
	 * Here, I will create custom Queue and then will perform some operations.
	 * 
	 * Step 1 : Since Queue also using Array internally data or value as array type.
	 * 
	 * Step 2 : Here, we need two pointer for insertion or deletion but Here, we can
	 * do only with one pointer(end). But before inserting check if queue is full. I
	 * yes, then return false otherwise insert.
	 * 
	 * Step 3 : Since queue is working on FIFO principle hence if we removed first
	 * item then we have to left shift all the elements.
	 * 
	 * Step 4 : Front() method give the first value which is in queue.
	 * 
	 * Step 5 : Now Display the elements of Queue.
	 */

	private int[] data;
	private static final int DEFAULT_SIZE = 10;
	int end = 0;

	public CustomQueue() {
		this(DEFAULT_SIZE);
	}

	public CustomQueue(int size) {
		this.data = new int[size];
	}

	public boolean insert(int item) {
		if (isFull()) {
			return false;
		}
		data[end++] = item;
		return true;
	}

	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Can't remove because queue is empty 😒😒😒");
		}

		// Removing first element as Queue worked on FIFO.
		int removed = data[0];
		/*
		 * Now after removed left shift the value. Hence loop will start from 1 because
		 * 0th element already removed.
		 */

		for (int i = 1; i < end; i++) {
			data[i - 1] = data[i];
		}
		end--;
		return removed;
	}

	public int front() throws Exception {
		if (isEmpty()) {
			throw new Exception("Can't show front value because queue is empty 😒😒😒");
		}
		return data[0];
	}

	public void display() {
		for (int i = 0; i < end; i++) {
			System.out.print(data[i] + " <- ");
		}
		System.out.println("END");
	}

	public boolean isEmpty() {
		return end == 0;
	}

	public boolean isFull() {
		return end == data.length - 1;
	}
}

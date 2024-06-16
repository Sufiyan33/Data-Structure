package queue;

public class CircularQueue {

	/*
	 * Here, we are going to implement Circular queue from scratch. We will take two
	 * pointer front & end.
	 * 
	 * To connect end with front we will take reminder of end with size => end %
	 * size.
	 */

	protected int[] data;
	public static final int DEFUALT_CAPACITY = 10;

	protected int front = 0;
	protected int end = 0;
	protected int size = 0;

	public CircularQueue() {
		this(DEFUALT_CAPACITY);
	}

	public CircularQueue(int size) {
		this.data = new int[size];
	}

	public boolean isFull() {
		return size == data.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean push(int items) throws CustomQueueException {
		if (isFull()) {
			throw new CustomQueueException("Can't add because Queue is full...");
		}

		data[end++] = items;
		end = end % data.length;
		size++;

		return true;
	}

	public int removeData() throws CustomQueueException {
		if (isEmpty()) {
			throw new CustomQueueException("Queue is Empty... ");
		}

		int removed = data[front++];
		front = front % data.length;
		size--;

		return removed;
	}

	public int front() throws CustomQueueException {
		if (isEmpty()) {
			throw new CustomQueueException("Queue is empty...");
		}

		return data[front];
	}

	public void display() {

		if (isEmpty()) {
			System.out.println("Circular Queue is empty...");
			return;
		}

		int i = front;
		do {
			System.out.print(data[i] + " -> ");
			i++;
			i %= data.length;
		} while (i != end);

		System.out.println("END");
	}
}


package stack;

public class CustomCircularQueue {

	/*
	 * Here, we will create custom circular Queue and then will perform some
	 * operations. In this we can add elements from front as well as end. Same for
	 * deletions also.
	 * 
	 * Step 1 : Since this is also using array internally, Hence creating array
	 * variables.
	 * 
	 * Step 2 : Here, we need to pointer front and end to do insertions or deletions
	 * from both end.
	 * 
	 * Step 3 : TO insert() elements first need to check whether it is full or not.
	 * If not full then add elements and while adding keep in mind that how to
	 * calculate index. for that end % data.length.
	 * 
	 * Step 4 : To remove() elements we don't need to shift element because it is a
	 * circular queue. But to find the correct index and add elements later we have
	 * to find index. for that front % data.length.
	 * 
	 * Step 4 : Front() method give the first value which is in queue.
	 * 
	 * Step 5 : Now Display the elements of Queue. While displaying you should know
	 * that initially front and end pointing to zero.Hence if you will try then it
	 * will print nothing. For the same made changes in Display() method as below.
	 */
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	protected int front = 0;
	protected int end = 0;

	private int size = 0;

	public CustomCircularQueue() {
		this(DEFAULT_SIZE);
	}

	public CustomCircularQueue(int size) {
		this.data = new int[size];
	}

	public boolean insert(int item) throws QueueException {
		if (isFull()) {
			throw new QueueException("You can't add because queue is full 😒😒😒");
		}
		data[end++] = item;
		end = end % data.length;
		size++;
		return true;
	}

	public int remove() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("You can't remove because queue is empty 😒😒😒");
		}

		int removed = data[front++];
		front = front % data.length;
		size--;
		return removed;
	}

	public int front() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Can't show front value because queue is empty 😒😒😒");
		}
		return data[front];
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty 😒");
		}
		int i = front;
		do {
			System.out.print(data[i] + " <- ");
			i++;
			i %= data.length;
		} while (i != end);
		System.out.println("END");
	}

	public boolean isFull() {
		return size == data.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}

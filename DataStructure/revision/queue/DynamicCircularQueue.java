package queue;

public class DynamicCircularQueue extends CircularQueue {

	public DynamicCircularQueue() {
		super();
	}

	public DynamicCircularQueue(int size) {
		super(size);
	}


	@Override
	public boolean push(int items) throws CustomQueueException {
		if (isFull()) {

			// resize the array.

			int[] temp = new int[data.length * 2];

			for (int index = 0; index < data.length; index++) {
				temp[index] = data[(front + index) & data.length];
			}

			front = 0;
			end = data.length;
			data = temp;
		}
		return super.push(items);
	}
}
